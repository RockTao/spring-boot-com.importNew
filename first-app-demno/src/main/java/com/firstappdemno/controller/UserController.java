package com.firstappdemno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.firstappdemno.domain.User;
import com.firstappdemno.repository.UserRepository;

@RestController
public class UserController {

	 private final UserRepository userRepository;
	 
	 @Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	 
	 @PostMapping("/person/save")
	 public User save(@RequestParam String name) {
		 User user= new User();
		 user.setName(name);
		if( userRepository.save(user)) {
			System.out.println("bc层皮" +user);
		}
		 
		return user;
		 
	 }
	 
	
}
