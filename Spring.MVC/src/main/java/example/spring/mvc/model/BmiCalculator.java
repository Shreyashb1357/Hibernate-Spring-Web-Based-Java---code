package example.spring.mvc.model;

public class BmiCalculator {
	
	public static float getEmi(float ht , float wt) {
		//BMI : Weight in kg / height in mtr
		float htInMtr = ht / 100.0f;
		float bmi = wt / (htInMtr * htInMtr);
		return bmi;
	}
}
