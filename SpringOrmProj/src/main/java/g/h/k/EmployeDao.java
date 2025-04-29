package g.h.k;



import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;



public class EmployeDao {
	
	private HibernateTemplate hibrtempl;

	public HibernateTemplate getHibrtempl() {
		return hibrtempl;
	}

	public void setHibrtempl(HibernateTemplate hibrtempl) {
		this.hibrtempl = hibrtempl;
	}

	@Override
	public String toString() {
		return "EmployeDao [hibrtempl=" + hibrtempl + "]";
	}

	public EmployeDao(HibernateTemplate hibrtempl) {
		super();
		this.hibrtempl = hibrtempl;
	}

	public EmployeDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Transactional
	public int insert(Employee Employee) {
		Integer i  = (Integer)hibrtempl.save(Employee);
	return i;
		
	}
	public Employee getEmp(int empid) {
		Employee employee = this.hibrtempl.get(Employee.class,empid);
		return employee;
	}
	public List<Employee> getAllData(){
	 List<Employee> all = this.hibrtempl.loadAll(Employee.class);
	 return all;
		
		
		
	}
	@Transactional
	public void delete(int empid) {
		Employee employee = this.hibrtempl.get(Employee.class,empid);
		this.hibrtempl.delete(employee);
		
	}
	

}
