package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automatiotesting {
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@class=\\\"btn btn-danger\\\"]")).click();
		
	}
}
