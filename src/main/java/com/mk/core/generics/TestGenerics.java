/**
 * 
 */
package com.mk.core.generics;

/**
 * 
 *
 * @author mpatra
 */

public class TestGenerics<T> {

	/**
	 * @param args
	 */
	private T obj;
	
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public static void main(String[] args) {
		
		TestGenerics<String> strTest = new TestGenerics<String>();
		strTest.setObj("Hello");
		System.out.println(strTest.getObj());
		@SuppressWarnings("rawtypes")
		TestGenerics objTest = new TestGenerics();		
		objTest.setObj("World");
		objTest.setObj(10);
		System.out.println(objTest.getObj());
		

	}

}
