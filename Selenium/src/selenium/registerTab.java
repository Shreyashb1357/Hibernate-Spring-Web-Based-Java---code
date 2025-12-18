package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerTab {
	public static void main(String[] args) throws Exception {
		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		//d.findElement(By.xpath("//input[@placeholder='First Name']")).click();
		d.findElement(By.xpath("//input[@ng-model=\'LastName\']")).click();
		d.findElement(By.xpath("//input[@ng-model=\'LastName\']")).click();
		d.findElement(By.xpath("//textarea[@ng-model=\'LastName\']")).click();		
		
	}

}