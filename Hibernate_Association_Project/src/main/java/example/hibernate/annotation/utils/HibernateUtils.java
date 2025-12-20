package example.hibernate.annotation.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.association.entity.Department;
import example.hibernate.association.entity.Employee;
import example.hibernate.association.entity.Passport;
import example.hibernate.association.entity.Person;

public class HibernateUtils {
	public static SessionFactory getSessionFactory() {
		Configuration con = new Configuration();
		con.setProperty("hibernate.connection.driver_class" , "com.mysql.cj.jdbc.Driver");
		con.setProperty("hibernate.connection.url" , "jdbc:mysql://localhost:3306/Associaltion");
		con.setProperty("hibernate.connection.username" , "root");
		con.setProperty("hibernate.connection.password" , "password");
		con.setProperty("hibernate.hbm2ddl.auto" , "update");
		con.setProperty("hibernate.connection.show-sql" , "true");
		
		//Class<Course> courseType = Course.class;
		//con.addAnnotatedClasses(Person.class , Passport.class); this is for person and passport
		
		con.addAnnotatedClasses(Department.class , Employee.class);
		SessionFactory factory = con.buildSessionFactory();

		return factory;
	}
}
