/**
 * 
 */
package com.mk.spring.core;

/**
 * 
 *
 * @author mpatra
 */
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class XMLBeanFactoryTest {

  public static void main(String[] args) {
    XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("resource/context.xml"));
    InjectSimpleDemo simple = (InjectSimpleDemo) factory.getBean("injectSimpleDemo");
    System.out.println(simple);
  }
}

class InjectSimpleDemo {
  private String name;

  private int age;

  private float height;

  private boolean isProgrammer;

  private Long ageInSeconds;

  public void setAgeInSeconds(Long ageInSeconds) {
    this.ageInSeconds = ageInSeconds;
  }

  public void setIsProgrammer(boolean isProgrammer) {
    this.isProgrammer = isProgrammer;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Name: %s\nAge: %d\nAge in Seconds: %d\nHeight: %g\nIs Programmer?: %b",
        this.name, this.age, this.ageInSeconds, this.height, this.isProgrammer);
  }
}
