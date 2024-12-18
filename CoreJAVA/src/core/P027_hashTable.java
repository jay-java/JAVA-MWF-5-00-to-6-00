package core;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class P027_hashTable {
	public static void main(String[] args) {
		Map map = new Hashtable();
		map.put(1, "c");//entry
		map.put(2, "c++");
		map.put("java", "c");
		map.put(454.3, "python");
		map.put(false, "kotlin");
		map.put(6, "dart");
		System.out.println(map);
		
		Set set = map.entrySet();
		Iterator itr= set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();
			System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());
		}
	}
}
