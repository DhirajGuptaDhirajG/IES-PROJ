package com.it.admin.controller;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.it.admin.domain.Plan;
import com.it.admin.service.PlanService;

@Controller
	public class viewPlanController{
		
		@Autowired
		private PlanService planService;
		
		@GetMapping("/editPlan")
		public String editPlan(@RequestParam("pid") Integer id, Model model){
			Plan p=planService.getPlanByPid(id);
			model.addAttribute("plan", p);
		return "updatePlan";
		}

		@GetMapping("/deletePlan")
	public String deletePlan(@RequestParam("pid") Integer id){ 
		planService.deletePlanByPid(id);

		return "viewPlan";
		
		}
	}

