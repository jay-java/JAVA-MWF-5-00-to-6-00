package com.se.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserController {
	
	@GetMapping("/")
	public String greet(HttpServletRequest request) {
		return "hello greeting : "+request.getSession().getId();
	}
}
