package com.it.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.it.app.domain.App;
import com.it.app.service.AppService;

@Controller
public class AppRegController {

	
	@Autowired
	private AppService appService;
	
	/*
	 * @GetMapping("/citizenReg") public String
	 * registerCitizen(@ModelAttribute("citizen") App app,Model model) {
	 * System.out.println("citizen register");
	 * 
	 * return "citizenCheck"; }
	 */
	@GetMapping("/citizens")
	public String registerCitizen(@ModelAttribute("citizen") App app,Model model) {
		System.out.println("citizen register");
		
		return "citizenView";
	}
	
	
	@PostMapping("/registerCitizen")
	public String handleCitizenBtn(@ModelAttribute("citizen") App app, Model model) {

		boolean isSaved = appService.saveApp(app);
		if(isSaved) {
	
			model.addAttribute("SuccMsg","Registartion successfull,You are eligible");
		}else {
			
			model.addAttribute("FailMsg","Registartion not successfull,You are not KT state citizen");
		}

		return "citizenView";

	}
}
