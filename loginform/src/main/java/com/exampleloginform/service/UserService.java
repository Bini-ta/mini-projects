package com.exampleloginform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loginform.domain.User;
import com.example.loginform.repository.UserRepository;

@Service

public class UserService {
	
@Autowired
private UserRepository repo;
public User login (String Username,String Password) {
	User user=repo.findByUsernameAndPassword(Username,Password);
	return user;
}

}
