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
        PassengerImp res = ac.getBean("passengerImp", PassengerImp.class);
        
//        Passenger po = new Passenger();
//        po.setPid(103);
//        po.setPName("Ramu kumar");
//       po.setPEmail("ramu@2021");
//       po.setPphonenumber(345780000);
//       po.setAddress("Bangalore");
//       int insert = res.insert(po);
//       System.out.println(insert);
        
//        Passenger po = new Passenger();
//        po.setPid(200);
//        po.setPName("Tanu kumari");
//        po.setPEmail("tanu@2021");
//        po.setPphonenumber(456789);
//        po.setAddress("Bangakok");
//        int edit = res.edit(po);
//        System.out.println(edit + "database is updated");
        
        
//       
//        // delete
//        int delete = res.Delete(100);
//        System.out.println(delete + "1 item is deleted")

        // single object
        
//        Passenger getSingleData = res.getPass(103);
//        System.out.println(getSingleData + "data is show in display");
//   
        
        List<Passenger> allData = res.getAllData();
        System.out.println(allData + "allData is a display");
        
        
    }
}
