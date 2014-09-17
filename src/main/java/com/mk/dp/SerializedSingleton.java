/**
 * 
 */
package com.mk.dp;

import java.io.Serializable;

/**
 * 
 *
 * @author mpatra
 */

public class SerializedSingleton implements Serializable {

	
	private SerializedSingleton() {
		// TODO Auto-generated constructor stub
	}
//	private static class SingletonHelper{
		private static final SerializedSingleton instance1 = new SerializedSingleton();
//	}
	public static SerializedSingleton getInstance(){
	//	return SingletonHelper.instance1;
		return instance1;
	}
	
	protected Object readResolve() {
        return getInstance();
    }
	
}
