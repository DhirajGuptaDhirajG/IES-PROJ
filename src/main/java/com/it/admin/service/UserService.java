package com.it.admin.service;

import java.util.List;

import com.it.admin.domain.User;

public interface UserService {

	public boolean saveUser(User user);

	public List<User> viewAccount();

	public User inactive(Integer id);
	
	public String getRegSuccMailBody(User user);

	public String generateTempPwd();

	//public boolean isUniqueEmail(String email);

	public boolean sendRegSuccEmail(String to,String subject, String body);

	public User getUserById(Integer id);

	//public boolean isTempPwdValid(String email, String tempPwd);

	//public boolean unlockAccount(String email,String pwd);

	public String sendPwdToEmail(String email, String subject,String body);

	public boolean deleteUserById(Integer id);
	
	public List<User> getAllUser( );
	
	//public String recoverPassword(String email);

	
	//public String getRecoverPwdEmailBody(User user);
	
	

	
}
