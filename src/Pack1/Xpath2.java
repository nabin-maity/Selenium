package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do;jsessionid=8E89C28824398F4AE76B1F97965AFE91");
		
		driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("USER NAME");
		driver.findElement(By.xpath("//input[@type='password' and @name='pwd']")).sendKeys("PASSWORD");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		driver.findElement(By.xpath("//nobr[text()='actiTIME 2017.4']"));
		//Contain function we can use for dynamic change attribute or partial link text
		driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME 2017.4')]"));
		driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]"));
		//Contain function we can use for dynamic change attribute or partial link text
		
		driver.findElement(By.linkText("actiTIME Inc."));
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		

		//A1 = //input[@value='A' and @type='text']
		//B1 =//input[@value='B' and @type='text']
		//A2 =//input[@value='A' and @type='button']
		//B2 =//input[@value='B' and @type='button']
		//c2 =//input[ @type='checkbox']
		
		//for a1a2b1b2
		//input[ @type='text' or @type='button']
		
		//using not
		//for a1a2b1b2
		//input[ not(@type='checkbox')]
		
		
    }
}