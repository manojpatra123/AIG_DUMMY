/**
 * 
 */
package com.mk.core.compare;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 *
 * @author mpatra
 */

public class TestComparator {
	
	
	public static void main(String[] args) {
		
		Map<String, Employee> innerMap = new HashMap<String, Employee>();
		innerMap.put("1", new Employee("Manoj", 25));
		innerMap.put("4", new Employee("Dinakar", 35));
		innerMap.put("2", new Employee("Vaibhav", 16));
		innerMap.put("3", new Employee("Ayush", 6));
		System.out.println("innerMap :\n"+ innerMap.toString());
		Map<String, Employee> sortedMap = new TreeMap<>(new AgeComparator(innerMap));
		sortedMap.putAll(innerMap);
		System.out.println("sortedMap :\n"+ sortedMap.toString());
		

	}

	
}
class AgeComparator implements Comparator<String>{

	Map<String, Employee> map = new HashMap<String, Employee>();
	
	
	/**
	 * @param map
	 */
	public AgeComparator(Map<String, Employee> map) {
		super();
		this.map = map;
	}


	@Override
	public int compare(String key1, String key2) {
		if(key1 instanceof String && key2 instanceof String ){
			
			Employee emp1 = map.get(key1);
			Employee emp2 = map.get(key2);
			return (emp1.getAge() - emp2.getAge());
		}
	
		return 0;
	}
	
}