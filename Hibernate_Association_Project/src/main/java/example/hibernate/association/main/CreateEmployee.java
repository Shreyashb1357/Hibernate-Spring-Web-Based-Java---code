package example.hibernate.association.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotation.utils.HibernateUtils;
import example.hibernate.association.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();				
		)
		{
			Employee emp = new Employee(null, "Shreyash", 80000);
			Employee emp1 = new Employee(null, "Mahesh", 90000);
			Employee emp2 = new Employee(null, "Rajesh", 45000);
			Employee emp3 = new Employee(null, "Milind", 65000);
			Employee emp4 = new Employee(null, "Jayesh", 95000);
			Transaction tr = sessionObj.beginTransaction();
			sessionObj.persist(emp);
			sessionObj.persist(emp1);
			sessionObj.persist(emp2);
			sessionObj.persist(emp3);
			sessionObj.persist(emp4);
			tr.commit();
			System.out.println("Successfully added Employee!!");			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
