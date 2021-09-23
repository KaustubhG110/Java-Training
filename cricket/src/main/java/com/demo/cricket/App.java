package com.demo.cricket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
	  ApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/cricket/config.xml");
      
      player player = (player)ctx.getBean("player");
      
      System.out.println(player);
 
	  
  }
}
