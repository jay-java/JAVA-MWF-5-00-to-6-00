package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public String first() {
		return "first method fetch";
	}
	
	@GetMapping("/alldata")
	public List<String> getAllData(){
		List<String> list = List.of("one","two","three","four");
		return list;
	}
	
}
