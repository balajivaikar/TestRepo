package org.bvr.test.test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new Hashtable<String,String>();
		map.put("Name", "Balaji");
		map.put("Age", "29");
		map.put("Location", "Earth");

		Set<Map.Entry<String,String>> set = map.entrySet();
		Iterator<Entry<String, String>> iter = set.iterator();
		while(iter.hasNext()) {
			Entry<String, String> entry = iter.next();
			String name = entry.getKey();
			String value = entry.getValue();
			System.out.println(name +"=" + value);
		}

System.out.println(map.get("Name"));
	}

	
}
