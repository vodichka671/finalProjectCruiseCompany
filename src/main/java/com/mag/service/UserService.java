package com.mag.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mag.domain.User;
import com.mag.repository.UserRepository;

@Service
public class UserService implements UserDetailsService{
	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username)  {
		return repo.findUserByUsername(username);
	}

}
