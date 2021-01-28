package com.project.contactManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	

	
	@GetMapping("/")
	public String home(Model m)
	{
		m.addAttribute("title","Home-SmartContact Manager");
		return "home";
	}
	@GetMapping("/about")
	public String about(Model m)
	{
		m.addAttribute("title","About-Contact-Manager");
		return "about";
	}
	@GetMapping("/login")
	public String login(Model m)
	{
		m.addAttribute("title","Login-ContactManager");
		return "login";
	}
	
	@GetMapping("/register")
	public String register(Model m)
	{
		m.addAttribute("title","Register");
		
		return "register";
	}
	

}
