package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;

@Controller
public class UserController {

//	@RequestMapping("/home")
//	public String home(HttpServletRequest request) {
//		request.setAttribute("num", 123);
//		request.setAttribute("name", "java");
//		User u = new User(1, "java",98764231);
//		return "home";
//	}
	

	@RequestMapping("/home")
	public String home(Model m) {
		m.addAttribute("num", 456);
		m.addAttribute("name", "java tech");
		List<User> list = List.of(
				new User(1, "java", 98765430),
				new User(2,"php",89731),
				new User(3,"dart",345456));
		m.addAttribute("list", list);
		return "home";
	}
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
}
