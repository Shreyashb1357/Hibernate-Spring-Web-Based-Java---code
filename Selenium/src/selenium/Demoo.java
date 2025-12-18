package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoo {
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver d = new ChromeDriver();   //open browser
		d.get("https://practicetestautomation.com/practice-test-login/");
		d.manage().window().maximize();
		
		Actions ac = new Actions(d);
		
		WebElement nwe= d.findElement(By.id("username"));
		//ac.moveToElement(nwe).contextClick().build().perform();
		nwe.sendKeys("Hello Milind");
		ac.moveToElement(nwe).doubleClick().build().perform();
	}
}