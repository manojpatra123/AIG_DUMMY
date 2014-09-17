/**
 * 
 */
package com.jmockit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

/**
 * 
 *
 * @author mpatra
 */

public class PersonTest {
 
		 @Test
		 public void testGetName() {
		  new MockUp<Person>() {
		   @SuppressWarnings("unused")
		   @Mock
		   public void $clinit(){
			    Person.updateBalance(500);
			}
/*		   @Mock		   
		   public void $init() {
		    //Dont assign name variable at all
		    //Leave it null
			   System.out.println("do something else");
			   //setName("Init MKP");
		   }
*/		 
		  };		   
//		  Person p = new Person("Testing MKP");
//		  String name = p.getName();
//		  System.out.println("Name:" + name);
		  System.out.println("Balance:" + Person.balanceAmt);
//		  assertNotNull("Name of person is null",name);
		  assertEquals("The balance amount is 500", 500, Person.balanceAmt);
		 }	 

}
