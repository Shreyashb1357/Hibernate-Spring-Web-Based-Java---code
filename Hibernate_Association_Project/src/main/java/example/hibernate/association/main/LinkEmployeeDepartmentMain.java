package example.hibernate.association.main;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import example.hibernate.annotation.utils.HibernateUtils;
import example.hibernate.association.entity.Department;
import example.hibernate.association.entity.Employee;

public class LinkEmployeeDepartmentMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();
			) {
				// fetch employees
			Employee emp = sessionObj.find(Employee.class , 1);
			Employee emp1 = sessionObj.find(Employee.class , 2);
			Employee emp2 = sessionObj.find(Employee.class , 3);
			Employee emp3 = sessionObj.find(Employee.class , 4);
			Employee emp4 = sessionObj.find(Employee.class , 5);
			//fetch department
			Department dept = sessionObj.find(Department.class, 1);
			Department dept1 = sessionObj.find(Department.class, 2);
			
			//Link employees to department
			Transaction tr =  sessionObj.beginTransaction();
			//creating list of employees
			List<Employee> empl = new ArrayList<Employee>();
			empl.add(emp);
			empl.add(emp1);
			empl.add(emp3);

			dept.addEmployee(emp2);
			dept.addEmployee(emp4);
			
			dept1.setEmployees(empl);
			//Adding this employee to 1st department..		
			tr.commit();	
			
			System.out.println("Successfuly linked to employee dept!!");
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
