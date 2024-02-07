package com.thymleafproject.service;

import org.springframework.stereotype.Component;

import com.thymleafproject.entity.User;

@Component
public interface UserService {

	public void registerUser(User user);
}
