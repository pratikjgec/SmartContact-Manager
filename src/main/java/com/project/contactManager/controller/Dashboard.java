package com.project.contactManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/user")
public class Dashboard {
	
	@RequestMapping("/index")
	public String dashBoard()
	{
		System.out.println("inside dashboard");
		return "user/index";
		
	}


	

}
