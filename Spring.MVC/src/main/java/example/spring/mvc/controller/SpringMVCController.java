package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import example.spring.mvc.model.BmiCalculator;
import example.spring.mvc.model.User;
import example.spring.mvc.model.UserValidator;
import jakarta.servlet.http.HttpServletRequest;


@Controller
public class SpringMVCController {
	
	@RequestMapping("/Home")
	public String getHomePage() {
		System.out.println("Request recieve!!");
		return "Home";
	}
	
	@RequestMapping("/Login")
	public String getLoginPage() {
		System.out.println("Request recieve!!");
		return "Login";
	}
	
//	@RequestMapping(value = "/validate", method = RequestMethod.POST)
//	public String getResultPage(HttpServletRequest request) {
//		String resultPage = "Failure";
//		String userId = request.getParameter("uid");
//		String password = request.getParameter("pwd");
//		User current = new User(userId , password);
//		boolean valid = UserValidator.isValid(current);
//		if(valid)
//			return "Success";
//		return resultPage;
//	}
	
	@PostMapping("/validate")
	public String getResultPage(String uid , String pwd) {
		String resultPage = "Failure";
		User current = new User(uid , pwd);
		boolean valid = UserValidator.isValid(current);
		if(valid)
			return "Success";
		return resultPage;
	}
	
	@GetMapping("/person")
	public String getPersonEntryPage() {
		return "personEntry";
	}
	
	@PostMapping("/bmi")
	public String findBMI(String name , float height , float weight , Model dataModel) {
		//Logic to calculate BMI (Note logic should not write here for safety reasong.)
		float bmi = BmiCalculator.getEmi(height, weight);
		//sorting name and bmi of a person into model
		dataModel.addAttribute("personName" , name);
		dataModel.addAttribute("personBmi" , bmi);
		return "bmiResult";
	}		
}