package com.se.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.se.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	private List<Student> list = new ArrayList<Student>();
	Student s1 = new Student(1, "java", "j123");
	Student s2 = new Student(2, "python", "p123");
	
	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return list;
	}

	@GetMapping("/csrf-token")
	public CsrfToken getCSRFToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}

	@PostMapping("/students")
	public Student addStudent(@RequestBody Student s) {
		list.add(s1);
		list.add(s2);
		list.add(s);
		return s;
	}
}
