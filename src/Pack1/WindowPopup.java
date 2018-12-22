package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver	();

	//Press ctr p and then escape using robot class
	driver.get("https://www.vtiger.com/");
	driver.findElement(By.id("menu-item-381")).click();
	
}
}
