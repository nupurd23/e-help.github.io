package com.ehelp.service;

import com.ehelp.entity.User;
import org.springframework.stereotype.Service;

import com.ehelp.repository.UserRepo;

@Service
public class ServiceClass {

	private UserRepo UR;
	public void save(User u) {
		UR.save(u);
	}
//	public User getuserById(String email) {
//		return UR.findById(email).get();
//	}
	
	
}
