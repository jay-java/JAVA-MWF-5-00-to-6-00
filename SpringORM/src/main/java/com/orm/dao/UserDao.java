package com.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.model.User;

public class UserDao {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void saveUser(User u) {
		this.hibernateTemplate.save(u);
	}
	
	@Transactional
	public void updateUser(User u) {
		this.hibernateTemplate.update(u);
	}
	
	@Transactional
	public void deleteUserById(int id) {
		User u = this.hibernateTemplate.get(User.class, id);
		this.hibernateTemplate.delete(u);
	}
	
	public User getUserById(int id) {
		User u= this.hibernateTemplate.get(User.class, id);
		return u;
	}
	
	public List<User> getAllUser(){
		return this.hibernateTemplate.loadAll(User.class);
	}
}
