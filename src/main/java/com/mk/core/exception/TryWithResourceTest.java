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

public class TryWithResourceTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
	printFile();

	}
	public static void printFile() throws FileNotFoundException, IOException{
	//	FileInputStream file = null;
		try(FileInputStream file = new FileInputStream("Test1.txt")){
			
			int data = file.read();
			while(data != -1){
				System.out.println(data);
				data = file.read();
			}
			
		}
/*		finally{
			file.close();
			
		}
*/	}

}
