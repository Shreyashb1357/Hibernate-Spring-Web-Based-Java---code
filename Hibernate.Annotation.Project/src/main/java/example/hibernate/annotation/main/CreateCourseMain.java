package example.hibernate.annotation.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotation.entity.Course;
import example.hibernate.annotation.utils.HibernateUtils;

public class CreateCourseMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();
				) {
			Course courseObj = new Course(null , "Basics of Python" , 90 , 189000);
			Transaction tx = sessionObj.beginTransaction();
			sessionObj.persist(courseObj);
			tx.commit();
			System.out.println("Successfully added Data in table!!!");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println( e.getMessage());
		}
	}
}
