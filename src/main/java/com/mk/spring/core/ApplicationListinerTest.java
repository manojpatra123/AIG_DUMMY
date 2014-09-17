/**
 * 
 */
package com.mk.spring.core;

/**
 * 
 *
 * @author mpatra
 */

import java.util.TimerTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationListinerTest {
  public static void main(String args[]) throws Exception {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("resource/context.xml");
 //   Thread.sleep(5 * 1000);

  }
}

class HeartbeatTask extends TimerTask implements ApplicationEventPublisherAware {

  private ApplicationEventPublisher eventPublisher;

  public void run() {
    HeartbeatEvent event = new HeartbeatEvent(this);
    eventPublisher.publishEvent(event);
  }

  public void setApplicationEventPublisher(ApplicationEventPublisher eventPublisher) {
    this.eventPublisher = eventPublisher;
  }
}

class HeartbeatForwarder implements ApplicationListener {
  public void onApplicationEvent(ApplicationEvent event) {
    if (event instanceof HeartbeatEvent) {
      System.out.println("Received heartbeat event: " + event.getTimestamp());
    }
  }
}

class HeartbeatEvent extends ApplicationEvent {
  public HeartbeatEvent(Object source) {
    super(source);
  }
}
