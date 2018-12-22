package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.LoginActitime;

public class LoginScript {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do;jsessionid=DC764E2B546DBE5A0391B7D5511AD582");
		LoginActitime ob = new LoginActitime(driver);
//		ob.getUsername().sendKeys("admin");
//		ob.getPassword().sendKeys("manager");
//		ob.getLoginbutton().click();
		
		ob.setusername("admin");
		ob.setpassword("manager");
		ob.setloginbutton();
}
}