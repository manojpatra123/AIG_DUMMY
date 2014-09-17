/**
 * 
 */
package com.mk.enumPkg;

/**
 * 
 *
 * @author mpatra
 */

public class TestEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(SampleEnum coin: SampleEnum.values() ){
			System.out.println("COINS:" + coin.value +"---"+ coin.color());
		}

	}

}
