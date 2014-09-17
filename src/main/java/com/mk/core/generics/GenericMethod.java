/**
 * 
 */
package com.mk.core.generics;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 *
 * @author mpatra
 */

public class GenericMethod<T extends Number> {

	/**
	 * @param args
	 */
	private T t;
	public <T> boolean isEqual(Set<? extends Number> s1, Set<? extends Number> s2 ){
		return s1.size()== s2.size();
		
	}
	
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		Set<String> s2 = new HashSet<>();
	//	isEqual(s1,s2); */
		Set<Integer> i1 = new HashSet<>();
		Set<Integer> i2 = new HashSet<>();
	//	isEqual(i1,i2);
		
		GenericMethod<Integer> numMethod = new GenericMethod<>();
		numMethod.isEqual(i1, i2);
	//	numMethod.isEqual(s1, s2);
	}

}
