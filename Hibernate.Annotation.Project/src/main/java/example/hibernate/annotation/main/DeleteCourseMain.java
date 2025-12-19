package example.hibernate.annotation.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotation.entity.Course;
import example.hibernate.annotation.utils.HibernateUtils;

public class DeleteCourseMain {

	public static void main(String[] args) {
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();
				){
			Course foundCourse = sessionObj.find(Course.class, 2);
			if(foundCourse != null){
				Transaction tx = sessionObj.beginTransaction();
				sessionObj.remove(foundCourse);
				tx.commit();
				System.out.println("Course deletion is done Successfully!!!");
			}else {
				System.out.println("No Such Id Exists!!!");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
