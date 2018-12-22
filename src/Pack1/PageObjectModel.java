package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectModel {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do;jsessionid=DC764E2B546DBE5A0391B7D5511AD582");
		 driver.manage().window().maximize();
		 driver.navigate().refresh();
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 
		

}
}