package com.it.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.it.admin.domain.Plan;
import com.it.admin.service.PlanService;

@Controller
public class PlanRegController {

	@Autowired
	private PlanService planService;
	
	

	@RequestMapping("/createPlan")
	 public String loadPlan(Model model) { // to load the form
			Plan planObj = new Plan();
			model.addAttribute("plan", planObj); 
			return "Plan";    
		
	 }

		@PostMapping("/savePlan")
	 public String handleSubmitBtn(@ModelAttribute("plan") Plan p, Model model) {
		 
			boolean isSaved	= planService.savePlan(p);
			
			if(isSaved) {
				if(p.getPid()!=null) {
					model.addAttribute("succMsg","Record updated successfully");
				}else {
					model.addAttribute("succMsg","Record saved successfully");
				}
			}else {
				model.addAttribute("errMsg","Failed to save Plan");
			}
			return "Plan"; // form submission
		
	 }
	 
		@RequestMapping("/viewPlans")
	 public String viewContacts(Model model) { //hyperlink
		List<Plan> allPlans = planService.getAllPlans();
		model.addAttribute("plans",allPlans);
			
		return "viewPlan";  
	 }
}

