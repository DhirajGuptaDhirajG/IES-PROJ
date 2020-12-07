package com.it.admin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.admin.domain.Plan;
import com.it.admin.entity.PlanEntity;
import com.it.admin.repository.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService{

	@Autowired
	private PlanRepository repo;
	
	@Override
	public boolean savePlan(Plan plan) {
		PlanEntity entity = new PlanEntity();
		BeanUtils.copyProperties(plan, entity);
		PlanEntity savedEntity = repo.save(entity);
		
		return savedEntity.getPid()!=null;
	}

	@Override
	public List<Plan> getAllPlans() {
		List<Plan> planList=new ArrayList<Plan>();
		List<PlanEntity> entityList = repo.findAll();
		entityList.forEach(entity-> {
		Plan p=new Plan();
		BeanUtils.copyProperties(entity,p);
		planList.add(p);
		});
		return planList;
	}

	@Override
	public Plan getPlanByPid(Integer pid) {
		Optional<PlanEntity> optional=repo.findById(pid);
		if(optional.isPresent()) {
			PlanEntity entity=optional.get();
			Plan p=new Plan();
			BeanUtils.copyProperties(entity, p);
			return p;
		}	
		return null;
	}

	@Override
	public boolean updatePlan(Plan plan) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePlanByPid(Integer pid) {
		repo.deleteById(pid);
		return true;
	}

}
