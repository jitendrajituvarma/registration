package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.RegistrationRepo;

@Service
public class RegistrationService {
  
	@Autowired
	RegistrationRepo registrationRepo;
	
	 public void saveUser(User user) {
		 registrationRepo.save(user);
	 }
}
