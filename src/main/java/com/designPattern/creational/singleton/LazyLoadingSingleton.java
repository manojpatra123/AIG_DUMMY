/**
 * 
 */
package com.designPattern.creational.singleton;

/**
 * 
 *
 * @author mpatra
 */
// Not Thread safe
public class LazyLoadingSingleton {
	
	private static LazyLoadingSingleton lzInstance;
	
	private LazyLoadingSingleton(){}
	
	public static LazyLoadingSingleton getInstance(){
		
		if(null != lzInstance){
			lzInstance = new LazyLoadingSingleton();
		}		
		return lzInstance;
	}

}
