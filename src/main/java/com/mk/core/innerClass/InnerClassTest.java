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

public class InnerClassTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// local class
		class Local{
			void printName(){
				System.out.println("inside local class");
			}
		}
		Local loc = new Local();
		loc.printName();
		InnerClassTest inner = new InnerClassTest();
		inner.test();
		
	}
	
	void test(){

		//Anonymous class
		Thread trd = new Thread()
		{
			@Override
			public void run(){
				System.out.println("Anonymous class run()");
			}
		};
		trd.start(); 
	} 
//	Member class

	public class InnerTest{
		 
		void name(){
			System.out.println("inner member class");
		}
	}
		
}

