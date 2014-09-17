/**
 * 
 */
package com.designPattern.creational.singleton;

/**
 * 
 *
 * @author mpatra
 */

public enum EnumSingleton {
	
	INSTANCE;
	
	public static EnumSingleton getInstance(){
		return EnumSingleton.INSTANCE;
	}

}
