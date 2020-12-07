package com.it.admin.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.admin.domain.User;
import com.it.admin.entity.UserEntity;
import com.it.admin.repository.UserRepository;
import com.it.admin.utils.EmailUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	 private EmailUtils emailUtils;
	
	@Override
	public boolean saveUser(User user) {
		
		user.setUserPwd(generateTempPwd());
		user.setStatus("ACTIVE");
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(user,entity);
		UserEntity userEntity = repo.save(entity);
		if(userEntity.getId()!=null){
			String to = user.getEmail();
			String subject = "Registartion successfull!!!";
			String body =  getRegSuccMailBody(user);
			sendRegSuccEmail(to,subject, body);
			return true;
		}

		return false;
	}

	/*
	 * @Override public boolean SaveUser(User user) {
	 * user.setAccStatus("AppConstants.LOCKED"); user.setUserPwd(generateTempPwd());
	 * 
	 * User_Entity entity = new User_Entity();
	 * BeanUtils.copyProperties(user,entity); User_Entity saveEntity =
	 * userRepo.save(entity); if(saveEntity.getUserId()!=null){ String to =
	 * user.getUserEmail(); String subject = "Registartion successfull!!!"; String
	 * body = getRegSuccMailBody(user); sendRegSuccEmail(to,subject, body); return
	 * true; }
	 * 
	 * return false; }
	 */
	@Override
	public String generateTempPwd() {

		// chose a Character random from this String 
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "0123456789"
				+ "abcdefghijklmnopqrstuvxyz"; 

		// create StringBuffer size of AlphaNumericString 
		StringBuilder sb = new StringBuilder(6); 

		for (int i = 0; i < 6; i++) { 

			// generate a random number between 
			// 0 to AlphaNumericString variable length 
			int index 
			= (int)(AlphaNumericString.length() 
					* Math.random()); 

			// add Character one by one in end of sb 
			sb.append(AlphaNumericString 
					.charAt(index)); 
		} 

		return sb.toString(); 
	} 
	
	/*
	 * @Override public String recoverPassword(String email) { UserEntity entity =
	 * repo.findByEmail(email); if(entity!=null) { User user = new User();
	 * BeanUtils.copyProperties(entity, user); String body =
	 * getRegSuccMailBody(user); String to = user.getEmail(); String subject =
	 * "Recovery password!!!"; return sendPwdToEmail(to,subject,body); }else {
	 * return "FailMsg"; } }
	 */
	@Override
	public String getRegSuccMailBody(User user) {
		String fileName = "unlock_acc.txt";
		List<String> replacedLines= null;
		String mailBody = null;
		try {
			Path path = Paths.get(fileName, "");
			Stream<String> lines = Files.lines(path);

			replacedLines = lines.map(line -> line.replace("{FNAME}", user.getFirstName())
					.replace("{LNAME}", user.getLastName())
					.replace("{ROLE}", user.getRole())
					.replace("{PWD}", user.getPwd())
					.replace("{EMAIL}", user.getEmail()))
					.collect(Collectors.toList());

			mailBody = String.join("", replacedLines);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return mailBody;
	}
	
	/*
	 * @Override public String getRecoverPwdEmailBody(User user) { String fileName =
	 * "Recover_Password_Mail_Body.txt"; List<String> replacedLines= null; String
	 * mailBody = null; try { Path path = Paths.get(fileName, ""); Stream<String>
	 * lines = Files.lines(path);
	 * 
	 * replacedLines = lines.map(line -> line.replace("{FNAME}",
	 * user.getFirstName()) .replace("{LNAME}", user.getLastName())
	 * .replace("{PWD}", user.getPwd())) .collect(Collectors.toList());
	 * 
	 * mailBody = String.join("", replacedLines); }catch(Exception e) {
	 * e.printStackTrace(); } return mailBody; }
	 */

	@Override
	public boolean sendRegSuccEmail(String to, String subject, String body) {
		return emailUtils.sendMail(to,subject,body);
	}

	@Override
	public List<User> viewAccount() {
		List<User> user=new ArrayList<User>();
		List<UserEntity> entityList = repo.findAll();
		entityList.forEach(entity-> {
		User u=new User();
		BeanUtils.copyProperties(entity,u);
		user.add(u);
		});
		return user;
	}

	/*
	 * @Override public boolean isUniqueEmail(String email) { UserEntity
	 * userEntity=repo.findByEmail(email); return userEntity!=null? false:true; }
	 * 
	 * @Override public boolean isTempPwdValid(String email, String tempPwd) {
	 * 
	 * UserEntity entity = repo.findByEmailAndPwd(email,tempPwd);
	 * 
	 * return entity!=null? true : false; }
	 */
	@Override
	public User getUserById(Integer id) {
		Optional<UserEntity> optional=repo.findById(id);
		if(optional.isPresent()) {
			UserEntity entity=optional.get();
		    User w=new User();
			BeanUtils.copyProperties(entity, w);
			return w;
		}	
		return null;
	}
	@Override
	public String sendPwdToEmail(String to, String subject, String body) {
		boolean isSent = emailUtils.sendMail(to,subject,body);
		if(isSent) {
			return "Password sent successfull";
		} else {
			return "Password is not sent successfull";
		}
	}
	
	/*
	 * @Override public boolean unlockAccount(String email,String pwd) { UserEntity
	 * entity = repo.findByEmail(email); entity.setStatus("UNLOCK");
	 * entity.setPwd(pwd); UserEntity savedEntity = repo.save(entity); return
	 * savedEntity.getId()!= null?true:false;
	 * 
	 * }
	 */
	
	@Override
	public List<User> getAllUser() {
		List<User> userList=new ArrayList<User>();
		List<UserEntity> entityList = repo.findAll();
		entityList.forEach(entity-> {
			User u=new User();
		BeanUtils.copyProperties(entity,u);
		userList.add(u);
		});
		return userList;
	}
	@Override
	public boolean deleteUserById(Integer id) {
		repo.deleteById(id);
		return true;

	}

	@Override
	public User inactive(Integer id) {
		Optional<UserEntity> optional=repo.findById(id);
		if(optional.isPresent()) {
			UserEntity entity=new UserEntity();
			User user=new User();
			BeanUtils.copyProperties(user,entity);
			entity.setStatus("INACTIVE");
			repo.save(entity);
			return user;
		}	
		return null;
	
		}
		
}