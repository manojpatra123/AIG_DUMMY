/**
 * 
 */
package com.mk.spring.cache;

/**
 * 
 *
 * @author mpatra
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(final String[] args) {
    final String xmlFile = "resource/context.xml";
    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlFile)) {

      final Worker worker = context.getBean(Worker.class);
      worker.longTask(1);
      worker.longTask(1);
      worker.longTask(1);
      worker.shortTask(2);
      worker.shortTask(2);
    }
  }
}
