/**
 * 
 */
package com.mk.core.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 *
 * @author mpatra
 */

public class ThrowDoubleExceptionTest {

	public static void main(String[] args) throws Exception{
		printFile();
	}
	
	private static void printFile() throws Exception {
		InputStream file = null;
		try{
			file = new FileInputStream("Test1.txt");
			int data = file.read();
			while(data != -1){
				System.out.println(data);
				data = file.read();			
			}
		}
/*		catch(Exception e){
			System.out.println("Inside catch:" + e.getMessage());

		}
*/		finally
		{
	//		if(file != null){
				try {
					file.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw e;
				}	
				
				System.out.println("Finally block:" + file);
		//	}
		}
		
	}
}
