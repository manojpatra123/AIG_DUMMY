/**
 * 
 */
package com.mk.staticTest;

/**
 * 
 *
 * @author mpatra
 */

class SuperClass {
     static void display() {
        System.out.println("Super");
    }
      void display1() {
    	 System.out.println("Super1");
     }
}
 
class SubClass extends SuperClass {
     static void display() {
        System.out.println("Sub");
    }
}
 
public class StaticTest {
    public static void main(String[] args) {
        // Prints "Super" in console
//        SuperClass sup = new SubClass();
//        System.out.println(sup.getClass().getName());
//        sup.display();
 
        // Prints "Sub" in console
        SuperClass sup1 = null;
  //      SubClass sub = (SubClass) sup1;
  //      System.out.println(sub.getClass().getName());
        sup1.display();
   //     sub.display();
    }
}
