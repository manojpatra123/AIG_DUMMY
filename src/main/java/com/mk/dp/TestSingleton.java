/**
 * 
 */
package com.mk.dp;

/**
 * 
 *
 * @author mpatra
 */

public class TestSingleton {
	 public static void main(String[] args) {
/*	        SingletonEnum instanceOne = new SingletonE
	        EagerInitializedSingleton instanceTwo = null;
	        try {
	            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) {
	                //Below code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println(instanceOne.hashCode());
	        System.out.println(instanceTwo.hashCode());
*/	    
		 System.out.println("Hashcode:" + SingletonEnum.instance.hashCode());
		 
		 SingletonEnum.instance.show();
		 TestSingleton obj1 = new TestSingleton();
		 obj1.printHash();
	 }
	 public void printHash(){
		 System.out.println("Hashcode:" + SingletonEnum.instance.hashCode());
	 }

}
