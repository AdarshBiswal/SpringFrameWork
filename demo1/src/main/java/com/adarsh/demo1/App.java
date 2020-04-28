package com.adarsh.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext Context=new ClassPathXmlApplicationContext("spring.xml");
//    	 Vechile obj= (Vechile) Context.getBean("bike");
//    	 obj.drive(); 
//    	 
//    	 Tyre t=(Tyre)Context.getBean("car");
//    	 System.out.println(t);
    	 
    	 Car obj=(Car)Context.getBean("car");
    	 obj.drive();
    } 
}
