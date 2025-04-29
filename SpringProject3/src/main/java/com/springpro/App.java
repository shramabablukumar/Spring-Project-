package com.springpro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac1 = new ClassPathXmlApplicationContext("com/springpro/Hello.xml");
    	 Student str = (Student) ac1.getBean("S3");
    	 System.out.println(str);
    }
}
