package example.hibernate.annotation.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.annotation.entity.Course;
import example.hibernate.annotation.utils.HibernateUtils;

public class RetriveCourseMain {

	public static void main(String[] args) {
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();
				){
			//finding the single course by using it id.
			//Class<Course> courseType = Course.class;
			//Object id= 1; //new Integer(1) = > AutoBoxing Happens 
			//Course foundCourse = sessionObj.find(courseType, id);
			Course foundCourse = sessionObj.find(Course.class, 2);
			
			if(foundCourse != null)			
				System.out.println(foundCourse);
			else
				System.out.println("No such id");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
