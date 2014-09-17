/**
 * 
 */
package com.mk.reflction;

import java.lang.reflect.Method;

/**
 * 
 *
 * @author mpatra
 */

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		
		emp.setName("Manoj");
		
	    System.out.println("Returned:" + getMethodName(emp, "Name"));

	}

	/**
	 * @param emp
	 * @return 
	 * @throws SecurityException
	 */
	private static Method getMethodName(Employee emp, String field) throws SecurityException {

		Class objClass= emp.getClass();
	    Method[] methods = objClass.getMethods();
	    for (Method method:methods)
	    {
	        String name=method.getName();
	        if(name.startsWith("get")&& name.endsWith(field))
	        {
	           System.out.println("MethodName:" + name + "Method:" +  method);
	           return method;
	        }
	    }
		return null;
	}
	
	public static class Employee{
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

}
