/**
 * 
 */
package com.mk.spring.Transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 *
 * @author mpatra
 */

public class Main {

	/**
	 * @param args
	 */	
		public static void main(String[] args) throws ClassNotFoundException {
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resource/spring/Transaction.xml");
			IUserDao dao = applicationContext.getBean("userDao", IUserDao.class);
			System.out.println("Select User:");
			dao.selectUser(1156235254);
	}

}
