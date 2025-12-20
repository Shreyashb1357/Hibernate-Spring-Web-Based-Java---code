package example.hibernate.association.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotation.utils.HibernateUtils;
import example.hibernate.association.entity.Department;

public class CreateDepartmentMain {

	public static void main(String[] args) {
		try(
			SessionFactory factory = HibernateUtils.getSessionFactory();
			Session sessionObj = factory.openSession();
			){
		
			Department dept = new Department(null, "IT", null);
			Department dept1 = new Department(null, "HR", null);
		
			Transaction tr = sessionObj.beginTransaction();
			sessionObj.persist(dept);
			sessionObj.persist(dept1);
			tr.commit();
			System.out.println("Successfully created Department!!");	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
