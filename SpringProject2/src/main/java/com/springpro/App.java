package com.springpro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac1 = new ClassPathXmlApplicationContext("com/springpro/Hello.xml");
    	Student s3 = (Student) ac1.getBean("S2");
    	System.out.println(s3);
    }
}
