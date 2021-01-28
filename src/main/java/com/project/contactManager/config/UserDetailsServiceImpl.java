package com.project.contactManager.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.project.contactManager.model.User;
import com.project.contactManager.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		User user1=userRepository.findByUserName(userName);
	//	System.out.println("Finding user in UserDetailsServiceImpl-"+user1);
		if(user1==null)
		{
			//System.out.println("404  not found");
			throw new UsernameNotFoundException("User Doesn't Exist !!!");
			
			
		}
		CustomUserDetails cud=new CustomUserDetails(user1);
			
		return cud;
	}
	
	

}
