package example.hibernate.association.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.annotation.utils.HibernateUtils;
import example.hibernate.association.entity.Passport;
import example.hibernate.association.entity.Person;

public class LinkPassportToPerson {

	public static void main(String[] args) {
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();)
		{
			//Fetch the passport
			String passportId = "085876fd-8322-4244-91be-f11243efe6ff";
			String passportId1 = "42dfb0bf-5185-4c9f-b0d7-a19a58628860";
			String passportId2 = "7a6c1b12-09c6-4be3-ab13-7b06c8178deb";
			
			Passport passportOnj = sessionObj.find(Passport.class, passportId);
			Passport passportOnj1 = sessionObj.find(Passport.class, passportId1);
			Passport passportOnj2 = sessionObj.find(Passport.class, passportId2);
			
			Person personObj = sessionObj.find(Person.class, 1);
			Person personObj1 =sessionObj.find(Person.class, 2);
			Person personObj2 = sessionObj.find(Person.class, 3);
			
			Transaction tx = sessionObj.beginTransaction();
			personObj.setPassportDetails(passportOnj);
			personObj1.setPassportDetails(passportOnj1);
			personObj2.setPassportDetails(passportOnj2);
			tx.commit();
			System.out.println("Successfully Added Passport no to person!!");	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
