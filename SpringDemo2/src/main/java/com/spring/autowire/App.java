package com.spring.autowire;

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
        
        AbstractApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/autowire/applicationcontext.xml");
        ac.registerShutdownHook();
        Student st1=(Student)ac.getBean("sbean1");
       
        System.out.println(st1);
       
        
    
    }
}
