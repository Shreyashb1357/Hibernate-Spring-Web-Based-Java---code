package example.hibernate.association.main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import example.hibernate.annotation.utils.HibernateUtils;
import example.hibernate.association.entity.Passport;


public class CreatePassportMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
			Session sessionOnj = factory.openSession();	
				){
			LocalDate expDate = LocalDate.now().plus(3, ChronoUnit.YEARS); 
			LocalDate expDate1 = LocalDate.now().plus(5, ChronoUnit.YEARS); 
			LocalDate expDate2 = LocalDate.now().plus(8, ChronoUnit.YEARS); 

			Passport passportObj = new Passport(null , "Milind" , expDate);
			Passport passportObj1 = new Passport(null , "Shreyash" , expDate1);
			Passport passportObj2 = new Passport(null , "Jayesh" , expDate2);
			
			Transaction tx = sessionOnj.beginTransaction();
			sessionOnj.persist(passportObj);
			sessionOnj.persist(passportObj1);
			sessionOnj.persist(passportObj2);
			tx.commit();
			System.out.println("passportObj is created!!");	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
