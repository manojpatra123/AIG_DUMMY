/**
 * 
 */
package com.designPattern.creational.singleton;

/**
 * 
 *
 * @author mpatra
 */
// Thread safe by using synchronization block but will be slow for multi-threaded environment
public class DoubleCheckSingleton {
	
	private static Object obj;
	private static DoubleCheckSingleton lzInstance;
	
	private DoubleCheckSingleton(){}
	
	public static DoubleCheckSingleton getInstance(){
		
		if(null != lzInstance){
			synchronized (obj) {
				if(null != lzInstance){
					lzInstance = new DoubleCheckSingleton();
				}
			}
		}		
		return lzInstance;
	}

}
