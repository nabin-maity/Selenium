package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath5 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver	();
	driver.navigate().to("https://www.facebook.com/");
	WebElement  userName = driver.findElement(By.id("email"));
	WebElement password = driver.findElement(By.id("pass"));
	int h1= userName.getSize().getHeight();
	int w1 = userName.getSize().getWidth();
	
	int h2 = password.getSize().getHeight();
	int w2 = password.getSize().getWidth();
	
	System.out.println(h1);
	System.out.println(h2);
	System.out.println(w1);
	System.out.println(w2);
	if((h1==h2)&& (w1==w2))
		
		System.out.println("pass");
	else
		System.out.println("Fail");
	driver.close();

}
}