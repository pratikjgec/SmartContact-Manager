package com.project.contactManager.repository;


import org.springframework.data.repository.CrudRepository;

import com.project.contactManager.model.User;

public interface UserRepository extends CrudRepository<User, String> {

	 User findByUserName(String userName);

	 
	 
}

