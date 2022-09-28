package com.spring.rest.springrest.services;

	import java.util.List;

	import com.spring.rest.springrest.entity.User;

	public interface UserService {

		public List<User> getUser();

		public void save(User user);

		public User findById(Integer id);

		public void delete(User user);

	}
	
	
