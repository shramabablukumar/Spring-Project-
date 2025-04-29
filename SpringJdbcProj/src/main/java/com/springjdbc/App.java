package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/springjdbc/Hello.xml");
        JdbcTemplate res = ac.getBean("jdbcTemplate", JdbcTemplate.class);
        String q = "INSERT INTO employeeetable(empid, empName, empCity) VALUES (?, ?, ?)";
        int reser = res.update(q,1,"Bablu kumar","Patna");
        System.out.println(reser + "Recorded is inserted");
        
       

    }
}
