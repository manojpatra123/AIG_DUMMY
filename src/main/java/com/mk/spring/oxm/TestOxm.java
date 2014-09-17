package com.mk.spring.oxm;
import java.io.IOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mk.spring.oxm.Customer;
public class TestOxm {
	private static final String XML_FILE_NAME = "Sample-Customer.xml";
	 
	public static void main(String[] args) throws IOException {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "resource/Spring-Oxm-Customer.xml" });
		XMLConverter converter = (XMLConverter) appContext.getBean("XMLConverter");
 
		Customer customer = new Customer();
		customer.setName("MANOJ PATRA");
		customer.setAge(12121212);
		customer.setFlag(true);
		customer.setAddress("This is a new address");
 
		System.out.println("Convert Object to XML!");
		//from object to XML file
		converter.convertFromObjectToXML(customer, XML_FILE_NAME);
		System.out.println("Done \n");
 
//		System.out.println("Convert XML back to Object!");
//		//from XML to object
//		Customer customer2 = (Customer)converter.convertFromXMLToObject(XML_FILE_NAME);
//		System.out.println(customer2);
//		System.out.println("Done");
 
	}
}
