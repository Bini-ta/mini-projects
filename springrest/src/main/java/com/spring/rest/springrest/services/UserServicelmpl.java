package com.spring.rest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.springrest.dao.UserRepository;
import com.spring.rest.springrest.entity.User;

@Service
public class UserServicelmpl  implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getUser() {

		return UserRepository.findAll();
	}

	@Override
	public void save(User user) {

		UserRepository.save(user);

	}

	@Override
	public User findById(Integer id) {

	return UserRepository.findById(id).get();
	}

	@Override
	public void delete(User user) {

		UserRepository.delete(user);

	}

}