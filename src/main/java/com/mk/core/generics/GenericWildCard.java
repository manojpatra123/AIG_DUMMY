/**
 * 
 */
package com.mk.core.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author mpatra
 */

public class GenericWildCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);intList.add(15);
		System.out.println("Sum is:" +sum(intList));
		
		List<Double> doubleList = new ArrayList<Double>();
		doubleList.add(10.5);doubleList.add(15.2);
		System.out.println("Sum is:" +sum(doubleList));

	}
	
	private static double sum(List<? extends Number> list){
		double sum =0;
		for(Number num:list){
			sum+= num.doubleValue();
		}
		
		return sum;
	}

}
