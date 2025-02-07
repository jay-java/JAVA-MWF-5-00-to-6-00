package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserDao;
import com.model.User;

@Controller
public class UserController {

	@Autowired
	private UserDao dao;

//	@RequestMapping("/home")
//	public String home(HttpServletRequest request) {
//		request.setAttribute("num", 123);
//		request.setAttribute("name", "java");
//		User u = new User(1, "java",98764231);
//		return "home";
//	}

//
//	@RequestMapping("/home")
//	public String home(Model m) {
//		m.addAttribute("num", 456);
//		m.addAttribute("name", "java tech");
//		List<User> list = List.of(
//				new User(1, "java", 98765430),
//				new User(2,"php",89731),
//				new User(3,"dart",345456));
//		m.addAttribute("list", list);
//		return "home";
//	}

	@RequestMapping("/")
	public String indexPage(Model m) {
		List<User> list = this.dao.getAllUser();
		m.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("/register")
	public String registerPage() {
		return "register";
	}

//	@RequestMapping(value = "/insert",method = RequestMethod.POST)
//	public String insertUser(@RequestParam("name") String name,
//			@RequestParam("contact") long contact,
//			@RequestParam("address") String address) {
//		System.out.println(name+contact+address);
//		return "";
//	}

	@RequestMapping("/home")
	public String home(Model m) {
		List<User> list = this.dao.getAllUser();
		m.addAttribute("list", list);
		return "/";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertUser(@ModelAttribute User u, Model m) {
		this.dao.insertOrUpdateUser(u);
		List<User> list = this.dao.getAllUser();
		m.addAttribute("list", list);
		return "home";

	}

	@RequestMapping(value = "/edit/{id}")
	public ModelAndView editUser(@PathVariable("id") int id,HttpServletRequest request) {
		User u = this.dao.getUserById(id);
		ModelAndView m = new ModelAndView();
		m.addObject("u", u);
		m.setViewName("update");
		return m;

	}
	
	@RequestMapping(value = "/delete/{id}")
	public String deleteUser(@PathVariable("id") int id, Model m) {
		this.dao.deleteUser(id);
		List<User> list = this.dao.getAllUser();
		m.addAttribute("list", list);
		return "home";
	}
}
