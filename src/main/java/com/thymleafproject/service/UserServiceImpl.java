package com.thymleafproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleafproject.entity.User;
import com.thymleafproject.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired 
	UserRepository userRepository;

	@Override
	public void registerUser(User user) {
		userRepository.save(user);
		
	}

}
