package com.it.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.it.admin.domain.User;
import com.it.admin.service.UserService;



@Controller
public class viewAccController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/editUser")
	public String editAcc(@RequestParam("id") Integer id, Model model){
		User user=userService.getUserById(id);
		model.addAttribute("user", user);
	return "updateAcc";
	}
	
	@RequestMapping("/changeStatus")
	public String deleteAcc(@RequestParam("id") Integer id, Model model){ 
		User user = userService.inactive(id);
		model.addAttribute("user", user);

		return "viewAcc";
		
		}
	}




