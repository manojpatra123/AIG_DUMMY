/**
 * 
 */
package com.jmockit;

/**
 * 
 *
 * @author mpatra
 */

public class Person {
	
	private String name;
	static int balanceAmt;
	
	public Person(){
		name = "Default MKP";
	}
	/**
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}
	
	static {
		  updateBalance(100);
		 }
		  
	 public static void updateBalance(int bal) {
		 balanceAmt += bal;
	 }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balanceAmt;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balanceAmt = balance;
	}
	

}
