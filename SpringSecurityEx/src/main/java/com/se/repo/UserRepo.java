package com.se.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.model.Student;

@Repository
public interface UserRepo extends JpaRepository<Student, Integer>{

	
	Student findByUsername(String username);
	
}
