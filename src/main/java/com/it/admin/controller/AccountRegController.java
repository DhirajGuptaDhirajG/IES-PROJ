package com.it.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.it.admin.domain.User;
import com.it.admin.service.UserService;

@Controller
public class AccountRegController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String index() {
		System.out.println("my index");
		return "index";
	}
	
	@GetMapping("/registers")
	public String register(@ModelAttribute("userAcc") User user,Model model) {
		System.out.println("my register");
		return "register";
	}
	
	
	@PostMapping("/registerUser")
	public String handleRegisterBtn(@ModelAttribute("userAcc") User user, Model model) {

		boolean isSaved = userService.saveUser(user);
		if(isSaved) {
	
			model.addAttribute("SuccMsg","Registartion successfull");
		}else {
			
			model.addAttribute("FailMsg","Registartion not successfull,Please try again");
		}

		return "register";

	}
	
	@GetMapping("/viewAccount")
	 public String viewAccount(Model model) { //hyperlink
		List<User> allUser = userService.getAllUser();
		model.addAttribute("users",allUser);
			
		return "viewAcc";  
	 }
	
}
	
