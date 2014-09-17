/**
 * 
 */
package com.mk.spring.core;

/**
 * 
 *
 * @author mpatra
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class Main {
  public static void main(String[] args) throws Exception {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("resource/context.xml");

    Resource res1 = ctx.getResource("file:c:\\LockAdm.log");
    System.out.println(res1.contentLength());
//    Resource res2 = ctx.getResource("classpath:target.classes.com.mk.App.class");
//    System.out.println(res2.getURL());
/*    Resource res3 = ctx.getResource("url:http://www.google.com");
    System.out.println(res3.getFile());
*/
    try{
        InputStream is = res1.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line;
        while ((line = br.readLine()) != null) {
   	       System.out.println(line);
        } 
        br.close();

  	}catch(IOException e){
  		e.printStackTrace();
  	}

  }
    

}