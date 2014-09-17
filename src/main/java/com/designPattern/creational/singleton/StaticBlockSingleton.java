/**
 * 
 */
package com.designPattern.creational.singleton;

/**
 * 
 *
 * @author mpatra
 */

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton elInstance;  // = new StaticBlockSingleton();
	
	private StaticBlockSingleton(){}
	
	static{
		elInstance = new StaticBlockSingleton();
	}
	
	public static StaticBlockSingleton getInstance(){
		
		return elInstance;
	}

}
