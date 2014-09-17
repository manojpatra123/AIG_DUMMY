package com.mk.spring.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mk.spring.aspect.CustomerBoImpl;
 
public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "resource/Spring-Customer.xml" });
 
		CustomerBoImpl cust = (CustomerBoImpl) appContext.getBean("customerBo");
		try {
			cust.addCustomerThrowException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
}