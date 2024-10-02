package core;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P025_TreeSet {
	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add(123);
		set.add(34643);
		set.add(-3454);
		set.add(0);
		set.add(68787);
		System.out.println(set);

		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
