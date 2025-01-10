package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {
	SessionFactory sf = null;
	Session session = null;
	Transaction tx = null;

	public void insertUser(User u) {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sf.openSession();
		tx = session.beginTransaction();
		session.save(u);
		tx.commit();
		session.close();
		sf.close();
	}

	public User getUserById(int id) {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sf.openSession();
		tx = session.beginTransaction();
		User u = session.get(User.class, id);
		return u;
	}

	public List<User> getAllUser() {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sf.openSession();
		tx = session.beginTransaction();
		String hql = "from User";
		Query q = session.createQuery(hql);
		List<User> list = q.list();
		return list;
	}

	public void updateUser(User u) {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sf.openSession();
		tx = session.beginTransaction();
		session.update(u);
		
//		Query q = session.createQuery("update User u set u.name=:name,u.contact=:contact,u.address=:address,u.email=:email,u.password=:password where u.id=:id");
//		q.setParameter(1, u.getName());
//		q.setParameter(2, u.getContact());
//		q.setParameter(3, u.getAddress());
//		q.setParameter(4, u.getEmail());
//		q.setParameter(5, u.getPassword());
//		q.setParameter(6, u.getId());
//		List<User> list = q.list();
//		User u1 = list.get(0);
//		System.out.println(u1);
	}

	public void deleteUser(int id) {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sf.openSession();
		tx = session.beginTransaction();
		User u = session.get(User.class, id);
		session.delete(u);
	}
}
