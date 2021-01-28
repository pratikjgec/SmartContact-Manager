package com.project.contactManager.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.contactManager.model.LoginData;
import com.project.contactManager.model.User;
import com.project.contactManager.repository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepo;
	
	
	
//	Registration controller
	
		@PostMapping("/do_register")
		String signUp(@ModelAttribute("user") User user, Model model)
		{
			String uname=user.getUserName();
			User user1=userRepo.findByUserName(uname);
			System.out.println(user1);
			if(user1!=null)
			{
				System.out.println("Username Already Exist, Please try another username!!!");
				model.addAttribute("existUser","UserName already Exist");
				return "register";
			}
			else {
				
				user.setUserName(user.getUserName());
				user.setName(user.getName());
				user.setPassword(passwordEncoder.encode(user.getPassword()));
				user.setRole("ROLE_USER");
				user.setEnable(true);
				
				User result=this.userRepo.save(user);
				model.addAttribute("success","Registration Successfull");
				model.addAttribute("user",result);
				System.out.println(result);
				return "register";
			}
		
			
			
		}
		
//		login controller
		
		
//		@PostMapping("/do_login")
//		String doLogin(@ModelAttribute("loginData") LoginData loginData, Model v)
//		{
//			String userName=loginData.getUserName();
//			String raw_password=loginData.getPassword();
//			System.out.println(loginData);
//			String password=passwordEncoder.encode(raw_password);
//			System.out.println(password);
//			Optional<User> us=userRepo.findByUserNameAndPassword(userName, password);
//			 System.out.println("Finding from DB="+us);
//			if(us.isPresent())
//			{
//				//v.addAttribute("user",user.getName());
//				System.out.println("Successfully loged-in");
//				return "success";
//
//			}
//			else {
//				System.out.println("incorrect username/password!! log-in failed!!!");
//				return "failed";
//			}
//			 
//			
//		}
	}

