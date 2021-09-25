package com.demo.books_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/books_constructor/config.xml");
    	Order order = (Order) ctx.getBean("order");
    	System.out.println(order);
    }
}
