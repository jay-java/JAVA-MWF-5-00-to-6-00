package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String first() {
		return "first method fetch";
	}
	
	@GetMapping("/alldata")
	public List<User> getAllData(){
		return service.getAllUsers();
	}
	
	
	@GetMapping("/alldata/{id}")
	public Optional<User> getAllData(@PathVariable("id") int id){
		return service.getUserById(id);
	}
	
	
	@PostMapping("/addUser")
	public User addNewUser(@RequestBody User u) {
		return this.service.addUser(u);
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User u) {
		return this.service.updateUser(u);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deletUser(@PathVariable("id") int id) {
		this.service.deleteUser(id);
		
	}
	
}
