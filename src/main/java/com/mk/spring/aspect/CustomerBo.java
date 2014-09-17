package com.mk.spring.aspect;

public interface CustomerBo {
	
	void addCustomer();	 
	String addCustomerReturnValue(); 
	void addCustomerThrowException() throws Exception; 
	void addCustomerAround(String name);
}
