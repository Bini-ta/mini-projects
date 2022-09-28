package com.spring.rest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.springrest.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}