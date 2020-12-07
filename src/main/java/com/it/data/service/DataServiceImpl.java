package com.it.data.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.app.entity.AppEntity;
import com.it.app.response.Citizen;
import com.it.dc.repository.DataRepository;

@Service
public class DataServiceImpl implements DataService{

	@Autowired
	DataRepository repo;
	@Override
	public Citizen getData(String id) {
		Optional<AppEntity> opt = repo.findById(id);
		if(opt.isPresent()) {
			AppEntity entity=opt.get();
			Citizen data = new Citizen();
			BeanUtils.copyProperties(entity, data);
			return data;
		}
		return null;
	}
	
}

