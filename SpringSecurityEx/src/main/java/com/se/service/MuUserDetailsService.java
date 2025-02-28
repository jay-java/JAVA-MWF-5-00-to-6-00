package com.se.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.se.model.Student;
import com.se.model.StudentPricipals;
import com.se.repo.UserRepo;

@Service
public class MuUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Student s = userRepo.findByUsername(username);
		if(s == null) {
			System.out.println("user not found");
			throw new UsernameNotFoundException("user not found");
		}
		return new StudentPricipals(s);
	}
	
	
}
