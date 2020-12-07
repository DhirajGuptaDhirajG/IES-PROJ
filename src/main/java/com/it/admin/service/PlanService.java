package com.it.admin.service;

import java.util.List;

import com.it.admin.domain.Plan;

public interface PlanService {

	 public boolean savePlan(Plan plan);
	 public List<Plan> getAllPlans( );
	 public Plan getPlanByPid(Integer pid);
	 public boolean updatePlan(Plan plan);
	 public boolean deletePlanByPid(Integer pid);
}
