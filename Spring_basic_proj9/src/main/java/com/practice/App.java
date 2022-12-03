package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
        Laptop l =(Laptop) context.getBean("l1");
        context.registerShutdownHook();
        System.out.println(l);
    }
}
