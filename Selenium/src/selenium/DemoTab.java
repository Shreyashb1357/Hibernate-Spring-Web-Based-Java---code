package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTab {
	public static void main(String[] args) throws Exception {
		WebDriver d= new ChromeDriver();
		d.get("https://www.cricbuzz.com/");
		String pw = d.getWindowHandle();
		
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://bookmyshow.com");
		Thread.sleep(1000);
		d.switchTo().window(pw);
	}
}