package com.hibernate;

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
        System.out.println( "Hello World!" );
        
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationcontext.xml");
        Student st1=(Student)ac.getBean("studentbean1");
       // Student st2=(Student)ac.getBean("studentbean2");
        System.out.println(st1);
        
    
    }
}
