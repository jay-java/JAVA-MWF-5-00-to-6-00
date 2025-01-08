package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("abc");
		s1.setContact(987654);

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("xyz");
		s2.setContact(987654);
		
		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("java");
		c1.setDuration("5 months");

		Course c2 = new Course();
		c2.setCid(2);
		c2.setCname("flutter");
		c2.setDuration("4 months");
		
		Course c3 = new Course();
		c3.setCid(3);
		c3.setCname("python");
		c3.setDuration("4 months");
		
		List<Student> stu_list = new ArrayList<Student>();
		stu_list.add(s1);
		stu_list.add(s2);

		List<Course> course_list1 = new ArrayList<Course>();
		course_list1.add(c1);
		course_list1.add(c2);

		List<Course> course_list2 = new ArrayList<Course>();
		course_list2.add(c1);
		course_list2.add(c2);
		course_list2.add(c3);
		
		s1.setCourses(course_list1);
		s2.setCourses(course_list2);
		
		c1.setStudents(stu_list);
		c2.setStudents(stu_list);
		
		
		session.save(s1);
		session.save(s2);
		session.save(c1);
		session.save(c2);
		session.save(c3);
		

		tx.commit();
		session.close();
		sf.close();
	}
}
