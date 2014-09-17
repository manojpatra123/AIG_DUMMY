package com.mk.core.coll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashMap {

		private TestHashMap getOuterType() {
			return TestHashMap.this;
		}



	/**
	 * @param <K>
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap();

		map.put("1", new String("Hello"));
		map.put("2", "World");
		map.put("2", "World111");

		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			System.out.println(entry.getKey() + ":" + entry.getValue() + "-->"
					+ map.get(key));
		}

		/*
		 * Iterator<Entry<String, String>> entries = map.entrySet().iterator();
		 * while (entries.hasNext()) { Entry<String, String> thisEntry =
		 * (Entry<String, String>) entries.next(); Object key =
		 * thisEntry.getKey(); Object value = thisEntry.getValue();
		 * System.out.println("Key:" + key + "Value:" + value); }
		 */

		Person p1 = new Person();
		p1.setId("133");
		
		Person p2 = new Person();
		p2.setId("136");
		
		Map<Person, String> map1 = new HashMap<>();
		map1.put(p1, "abcd");
		map1.put(p2, "ab");
		
		for (Entry<Person, String> entry : map1.entrySet()) {
			Person key = entry.getKey();
			System.out.println(entry.getKey().getId() + ":" + entry.getValue() + "-->"
					+ map1.get(key));
		}

	}
}

class Person {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return 12;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}