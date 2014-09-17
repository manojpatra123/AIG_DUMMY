/**
 * 
 */
package com.mk.spring.cache;

import org.springframework.cache.annotation.Cacheable;
/**
 * 
 *
 * @author mpatra
 */
import org.springframework.stereotype.Component;

@Component
public class Worker {
  @Cacheable("long")	
  public String longTask(final long id) {
    System.out.printf("Running long task for id: %d...%n", id);
    return "Long task for id " + id + " is done";
  }

  public String shortTask(final long id) {
    System.out.printf("Running short task for id: %d...%n", id);
    return "Short task for id " + id + " is done";
  }
}
