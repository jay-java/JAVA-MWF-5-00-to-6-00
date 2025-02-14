package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.model.User;
import com.example.repo.UserRepository;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext con= SpringApplication.run(SpringBootJpaApplication.class, args);
		UserRepository repo = con.getBean(UserRepository.class);
			
//		User u = new User(2, "python", 98764231, "ahmedabad");
//		repo.save(u);
		
//		User u = new User(2, "python", 98764231, "delhi");
//		repo.save(u);
		
//		Optional<User> u= repo.findById(1);
//		System.out.println(u);
		
//	 	List<User> list = repo.findAll();
//	 	System.out.println(list);
		
		User u = repo.findByAddress("delhi");
		System.out.println(u);
	}

}
