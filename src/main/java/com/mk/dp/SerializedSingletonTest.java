/**
 * 
 */
package com.mk.dp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * 
 *
 * @author mpatra
 */

public class SerializedSingletonTest {

	/**
	 * @param args
	 */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("SerializedSingleton.ser"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("SerializedSingleton.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        
    }

}
