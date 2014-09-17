/**
 * 
 */
package com.designPattern.creational.singleton;

/**
 * 
 *
 * @author mpatra
 */
// Thread safe but eagerly loaded, not advisable as singleton class are mostly resource centric classes 
public class EagerlyLoadingSingleton {
	
	private static final EagerlyLoadingSingleton elInstance = new EagerlyLoadingSingleton();
	
	private EagerlyLoadingSingleton(){}
	
	public static EagerlyLoadingSingleton getInstance(){
		
		return elInstance;
	}

}
