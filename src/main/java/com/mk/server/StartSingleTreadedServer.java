/**
 * 
 */
package com.mk.server;

/**
 * 
 *
 * @author mpatra
 */

public class StartSingleTreadedServer {
	public static void main(String[] args){
	
		SingleThreadedServer server = new SingleThreadedServer(9000);
		new Thread(server).start();
		System.out.println("Server started");

		try {
		    Thread.sleep(300 * 1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();  
		}
		System.out.println("Stopping Server");
		server.stop();
	}
	
}
