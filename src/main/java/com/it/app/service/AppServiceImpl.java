package com.it.app.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.it.app.domain.App;
import com.it.app.entity.AppEntity;
import com.it.app.repository.AppRepository;
import com.it.app.response.Citizen;


@Service
public class AppServiceImpl implements AppService{


	@Autowired
	private AppRepository repo;

	@Override
	public boolean saveApp(App app) {
		//String status=null;
		AppEntity appEntity=null;
		boolean isCitizenState = checkCitizenState(app.getSsn());
		
		if(isCitizenState) {
			appEntity = new AppEntity();
			BeanUtils.copyProperties(app, appEntity);
			appEntity.setStatus("ACTIVE");
			appEntity = repo.save(appEntity);

		return appEntity.getId()!=null;
	}
		return false;
	}

	@Override
	public boolean checkCitizenState(String ssn) {
		boolean flag=false;
		App app=new App();
		String  endPointUrl="http://localhost:9091/verify/"+ssn;
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Citizen> responseEntity=rt.getForEntity(endPointUrl, Citizen.class);
		
		int statusCodeValue = responseEntity.getStatusCodeValue();
		if(statusCodeValue==200) {
			Citizen citizenResponse =responseEntity.getBody();
			if(citizenResponse.getState().equals("KT")) {
				flag=true;
				System.out.println(citizenResponse);
			}
		}
		return flag;
		
	}
}
	
	


