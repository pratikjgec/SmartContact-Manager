package com.project.contactManager.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.project.contactManager.model.User;

import javassist.compiler.ast.Symbol;

public class CustomUserDetails implements UserDetails{

	private User user; 
	
	
	
	public CustomUserDetails(User user) {
		super();
		this.user = user;
	}

//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		
//		SimpleGrantedAuthority simpleGrantedAuthority=new SimpleGrantedAuthority(user.getRole());
//		System.out.println(user.getRole());
//		ArrayList ob=new ArrayList();
//		ob.add(simpleGrantedAuthority);
//		System.out.println(simpleGrantedAuthority);
//		return ob;
//	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	    List<GrantedAuthority> authorities = new ArrayList<>();
	        authorities.add(new SimpleGrantedAuthority(user.getRole()));
	 
	    return authorities;
	}
	

	
	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {

		return user.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	

}
