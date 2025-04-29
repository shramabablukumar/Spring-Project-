package com.springpro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("com/springpro/Hello.xml");
    	Student st = (Student) ac.getBean("S3");
    	System.out.println(st);
    }
}
