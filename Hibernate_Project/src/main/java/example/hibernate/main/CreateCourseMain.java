package example.hibernate.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.hibernate.Course;

public class CreateCourseMain {

	public static void main(String[] args) {
		Session sessionObj = null;
		SessionFactory factoryObj = null;
		try {
			Configuration conf = new Configuration();
			conf = conf.configure();
			// Obtaining SessionFactory
			factoryObj = conf.buildSessionFactory();
			// Obtaining Session
			sessionObj = factoryObj.openSession();
			//Obtaining Transaction
			Transaction tx = sessionObj.beginTransaction();
			//Creating an entity class object
			Course courseObj = new Course(104 , "Mastering C#" , 80 , 11500);
			//Sorting course object into session
			sessionObj.persist(courseObj);
			//Committing the Transaction
			tx.commit();
			System.out.println("Course Created Successfully!!");
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			//closing session
			sessionObj.close();
			//closing Session Factory
			factoryObj.close();
		}
	}

}
