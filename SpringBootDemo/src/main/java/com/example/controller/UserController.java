package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@RestController
public class UserController {

	@RequestMapping("/")
//	@ResponseBody
	public String index() {
		return "hello this is index page";
	}
	
	@RequestMapping("/user")
	public User getuser() {
		User u  = new User();
		return new User(1, "java", 987654321, "ahmedabad");
	}
}
