package com.springjdbc;

import java.util.List;

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
       StudentImpl res = ac.getBean("stude",StudentImpl.class);
       
//       Student So = new Student();
//       So.setSid(4);
//       So.setSName("Bablu4");
//       So.setSEmail("tanu1");
//       So.setSPass("ram1");
//       int insert = res.insert(So);
//       System.out.println(insert + "Data is inserted"); Student So = new Student();
       
//       Student So = new Student();
//       So.setSid(4);
//       So.setSName("Shyam");
//       So.setSEmail("shayam@2021");
//       So.setSPass("shh");
//       int upt = res.update(So);
//       System.out.println(upt+ "application is updated");
//       int delete = res.Delete(1);
//       System.out.println(delete + "one data is Deleted");
//       
      
//       Student stud = res.getStud(4);
//       System.out.println(stud + "result is Fetch one Data");
       
       List<Student> alldata = res.getAlldata();
       for(Student s1: alldata) {
    	   System.out.println(s1);
       }
      
       
       
       
      
       
    }
}
