/**
 * 
 */
package com.designPattern.creational.singleton;

/**
 * 
 *
 * @author mpatra
 */
// Thread safe by using synchronization but will be slow for multi-threaded environment
public class SynchronizedSingleton {
	
	private static SynchronizedSingleton lzInstance;
	
	private SynchronizedSingleton(){}
	
	public static synchronized SynchronizedSingleton getInstance(){
		
		if(null != lzInstance){
			lzInstance = new SynchronizedSingleton();
		}		
		return lzInstance;
	}

}
