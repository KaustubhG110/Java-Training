package com.demo.books;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/books/config.xml");
        Order order = (Order) ctx.getBean("order");
        System.out.println(order);
    }
}
