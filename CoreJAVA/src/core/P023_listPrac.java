package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Mobile{
	int ram;
	String model;
	double price;
	
	public Mobile(int ram, String model, double price) {
		super();
		this.ram = ram;
		this.model = model;
		this.price = price;
	}

	public String toString() {
		return "Mobile [ram=" + ram + ", model=" + model + ", price=" + price + "]";
	}
	
}
public class P023_listPrac {
	public static void main(String[] args) {
		Mobile m1 = new Mobile(8, "vivo", 9780);
		Mobile m2 = new Mobile(10, "samsug", 97801);
		Mobile m3 = new Mobile(12, "apple", 97802);
		Mobile m4 = new Mobile(14, "asus", 97803);
		Mobile m5 = new Mobile(16, "heuwai", 97804);
		
		List<Mobile> list = new ArrayList<Mobile>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		System.out.println(list);
		
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		for(Mobile m:list) {
			System.out.println(m);
		}
		
	}
}