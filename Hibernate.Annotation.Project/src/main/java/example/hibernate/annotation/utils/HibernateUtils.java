package example.hibernate.annotation.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.annotation.entity.Course;

public class HibernateUtils {
	public static SessionFactory getSessionFactory() {
		Configuration con = new Configuration();
		con.setProperty("hibernate.connection.driver_class" , "com.mysql.cj.jdbc.Driver");
		con.setProperty("hibernate.connection.url" , "jdbc:mysql://localhost:3306/Udemy");
		con.setProperty("hibernate.connection.username" , "root");
		con.setProperty("hibernate.connection.password" , "password");
		con.setProperty("hibernate.hbm2ddl.auto" , "update");
		con.setProperty("hibernate.connection.show-sql" , "true");
		
		//Class<Course> courseType = Course.class;
		con.addAnnotatedClass(Course.class);
		SessionFactory factory = con.buildSessionFactory();
 
		return factory;
	}
}
