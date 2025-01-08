package OneToManyToOne;

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

		Owner1 o1 = new Owner1();
		o1.setId(1);
		o1.setName("java");
		o1.setAddress("xyz");

		Owner1 o2 = new Owner1();
		o2.setId(2);
		o2.setName("dart");
		o2.setAddress("abc");

		Vehicle1 v1 = new Vehicle1();
		v1.setVid(1);
		v1.setModel("BMW");

		Vehicle1 v2 = new Vehicle1();
		v2.setVid(2);
		v2.setModel("Mercedes");

		Vehicle1 v3 = new Vehicle1();
		v3.setVid(3);
		v3.setModel("VOLVO");

		Vehicle1 v4 = new Vehicle1();
		v4.setVid(4);
		v4.setModel("AUDI");

		List<Vehicle1> list1 = new ArrayList<Vehicle1>();
		list1.add(v1);
		list1.add(v2);

		List<Vehicle1> list2 = new ArrayList<Vehicle1>();
		list2.add(v3);
		list2.add(v4);
		
		o1.setVehicles(list2);
		o2.setVehicles(list1);
		
		v1.setOwner(o2);
		v2.setOwner(o2);
		v3.setOwner(o1);
		v4.setOwner(o1);
		
		session.save(o1);
		session.save(o2);
		session.save(v1);
		session.save(v2);
		session.save(v3);
		session.save(v4);

		tx.commit();
		session.close();
		sf.close();
	}
}
