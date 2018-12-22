package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.LoginFacebookPage;

public class FBLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		LoginFacebookPage fb = new LoginFacebookPage(driver);
		fb.setusername("nabinmaity@ymail.com");
		fb.setpassword("iaminlove");
		fb.setloginbutton();
		

}
}