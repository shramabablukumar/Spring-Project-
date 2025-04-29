package g.h.k;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("g/h/k/Hello.xml");
         EmployeDao bean = ac.getBean("edao",EmployeDao.class);
//        
//        Employee Eo = new Employee(1,"Bablu kumar","Bangalore");
//        int result = bean.insert(Eo);
//        System.out.println(result + "Saved data !!!");
         
         
//   
         
         
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         boolean run = true;
         while(run) {
        	 System.out.println("press 1 to add new Employee");
        	 System.out.println("press 2 to display all Employee");
        	 System.out.println("press Single Employee Data");
        	 System.out.println("press 4 to delete all Employee Data");
        	 try {
        		 int choice = Integer.parseInt(br.readLine());
        		 switch(choice) {
        		 case 1:
        			 System.out.println("Enter the Employee id");
        			 int emid = Integer.parseInt(br.readLine());
        			 System.out.println("Enter the EmployeeName");
        			 String eName = br.readLine();
        			 System.out.println("Enter the Employee City");
        			 String ecity = br.readLine();
        			 Employee eo = new Employee();
        			 eo.setEmpid(emid);
        			 eo.setEmpName(eName);
        			 eo.setEmpCity(ecity);
        			 int result = bean.insert(eo);
        			 System.out.println(result + "Employee Read");
        			System.out.println("..............................................");
        			 break;
        			 
        		 case 2:
        			 List<Employee> emp = bean.getAllData();
        			 for(Employee e1: emp) {
        				System.out.println(e1.getEmpid());
        				System.out.println(e1.getEmpName());
        				System.out.println(e1.getEmpCity());
        			 }
        			 System.out.println("=============================================");
        			 break;
        			 
        			 
               case  3:
        			 
        			 System.out.println("Enter the Empid what you want to get");
        			 int eid = Integer.parseInt(br.readLine());
        			 Employee emp2 = bean.getEmp(eid);
        			 System.out.println("id : " + emp2.getEmpid());
        			 System.out.println("Name : " +emp2.getEmpName());
        			 System.out.println("City " + emp2.getEmpCity());
        			 break;
        			 
               case 4:
            	   System.out.println("Enter the Empid to delete");
            	   int id = Integer.parseInt(br.readLine());
            	   bean.delete(id);
            	   System.out.println("selected employee is delted");
            	   break;
            	   default :
            		   System.out.println("Data is not Found");
        		 }
        		 
        		 
        			 
        	 }catch(Exception ex) {
        		 ex.printStackTrace();
        	 }
         }


        
    }
}
