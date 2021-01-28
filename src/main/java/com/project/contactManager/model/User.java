package com.project.contactManager.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	private String userName;
	private String name;
	private String password;
	private String role;
	private boolean enable;
//	private List<> contact;
	

//	public List<Object> getContact() {
//		return contact;
//	}
//
//	public void setContact(List<Object> contact) {
//		this.contact = contact;
//	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", name=" + name + ", password=" + password + ", role=" + role
				+ ", enable=" + enable +"]";
	}
	


}
