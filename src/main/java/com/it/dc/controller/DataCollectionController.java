package com.it.dc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.it.app.response.Citizen;
import com.it.data.service.DataService;

@Controller
public class DataCollectionController {
		
		@Autowired
		DataService dataService;
		
		@GetMapping("/DataCollect")
		public String createCaseForm() {
			System.out.println("my case");
			return "createCaseForm";
		}
		
		@PostMapping("/viewData")
		public String editAcc(@RequestParam("id")String id, Model model){
			Citizen data=dataService.getData(id);
			model.addAttribute("data", data);
		return "createCaseForm";
		}
}

