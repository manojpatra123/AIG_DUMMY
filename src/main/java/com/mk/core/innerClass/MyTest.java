/**
 * 
 */
package com.mk.core.innerClass;

import java.util.ArrayList;

/**
 * 
 *
 * @author mpatra
 */

public class MyTest {
	
	
	public static void main(String[] args){
		MyTest myTest = new MyTest();
	//	myTest.InnerTest inner = myTest. new
//		myTest.test();
//		inner.name();
//		MyTest.InnerTest inr = new InnerTest();
//		inr.name();
	}
	
	void test(){
		InnerTest inner = new InnerTest();
		inner.name();
	}
	
	 public class InnerTest{
		 
		void name(){
			System.out.println("inner member class");
		}
	}

}
