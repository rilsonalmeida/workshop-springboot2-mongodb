package com.pulsar.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulsar.workshopmongo.domain.User;
import com.pulsar.workshopmongo.repository.UserRepository;

@Service
public class UserService  {
	
	@Autowired

	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
		
	}

}
