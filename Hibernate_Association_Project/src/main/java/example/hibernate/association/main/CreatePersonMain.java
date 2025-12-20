package example.hibernate.association.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotation.utils.HibernateUtils;
import example.hibernate.association.entity.Person;

public class CreatePersonMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
			Session sessionOnj = factory.openSession();	
				){
			Person personObj = new Person(null , "Milind" , "milinzatu@zatu.com" , null);
			Person personObj1 = new Person(null , "Shreyash0" , "shreyash@gmail.com" , null);
			Person personObj2 = new Person(null , "Jayesh" , "jayesh@zatu.com" , null);
			
			Transaction tx = sessionOnj.beginTransaction();
			sessionOnj.persist(personObj);
			sessionOnj.persist(personObj1);
			sessionOnj.persist(personObj2);
			tx.commit();
			System.out.println("Person is created!!");
					
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
