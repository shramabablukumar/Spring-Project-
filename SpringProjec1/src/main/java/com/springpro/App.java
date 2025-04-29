package com.springpro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("com/springpro/Hello.xml");
    	Student a1 = (Student) ac.getBean("S1");
    	System.out.println(a1);
    }
}
