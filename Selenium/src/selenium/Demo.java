package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		//WebDriver wdl = new ChromeDriver();
		wd.get("https://practicetestautomation.com/practice-test-login/");
		wd.manage().window().maximize();
		Thread.sleep(1000);
		wd.get("https://www.google.com");
		//wd.get("https://practicetestautomation.com/practice-test-login/");
		//wd.close();
//		System.out.println(wd.getTitle());
//		System.out.println(wd.getPageSource());
//		System.out.println(wd.getCurrentUrl());
		
//		wd.findElement(By.id("username")).sendKeys("student");
//		wd.findElement(By.id("password")).sendKeys("Password123");
//		wd.findElement(By.id("submit")).click();
		
		wd.navigate().forward();
		Thread.sleep(1000);		
		wd.navigate().back();
		
		System.out.println(wd.getTitle());
		//wd.findElement(By.id("username")).sendKeys("student");
		//wd.findElement(By.id("password")).sendKe	ys("Password123");
		//wd.findElement(By.id("submit")).click();
		
		

	}
}