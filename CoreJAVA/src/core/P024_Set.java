package core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P024_Set {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(123);
		set.add("java");
		set.add(false);
		set.add(345.345);
		set.add('g');
		set.add(123);
		System.out.println(set);

		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}