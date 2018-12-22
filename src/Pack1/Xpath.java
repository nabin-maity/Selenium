package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		}
	
	
	public static void main(String[] args)
	{
		// Absolute Xpath
		
		//WebDriver driver =new ChromeDriver();
		WebDriver driver =new FirefoxDriver();
		
//		driver.get("file:///C:/Users/user/Desktop/Xpath.html");
//		//A
//		driver.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys("  Nabin  ");
//		//B
//		driver.findElement(By.xpath("html/body/div[1]/input[2]")).sendKeys("  Sandeep ");
//		//c
//		driver.findElement(By.xpath("html/body/div[2]/input[1]")).sendKeys("  Nabin Maity  ");
//		//d
//		driver.findElement(By.xpath("html/body/div[2]/input[2]")).sendKeys("  Sandeep Paramanik");
//		//AB
//		driver.findElement(By.xpath("html/body/div[1]"));
//		//CD
//		driver.findElement(By.xpath("html/body/div[2]"));
//		//AC
//		driver.findElement(By.xpath("html/body/div/input[1]"));
//		//BD
//		driver.findElement(By.xpath("html/body/div/input[2]"));
//		
//		//AD  one option pipeline used
//		driver.findElement(By.xpath("html/body/div[1]/input[1]|html/body/div[2]/input[2]"));
//		//BC
//		driver.findElement(By.xpath("html/body/div[1]/input[2]|html/body/div[2]/input[1]"));
	 
		//***********************************************************
		
		// Relative Xpath
		
//		driver.get("file:///C:/Users/user/Desktop/Xpath.html");
//		
//		//A
//		driver.findElement(By.xpath("//div[1]/input[1]")).sendKeys("  Nabin  ");
//		//B
//		driver.findElement(By.xpath("//div[1]/input[2]")).sendKeys("  Sandeep ");
//		//c
//		driver.findElement(By.xpath("//div[2]/input[1]")).sendKeys("  Nabin Maity  ");
//		//d
//		driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("  Sandeep Paramanik");
//		//AB
//		driver.findElement(By.xpath("//div[1]/input"));
//		//CD
//		driver.findElement(By.xpath("//div[2]/input"));
//		//AC
//		driver.findElement(By.xpath("//div/input[1]"));
//		//BD
//		driver.findElement(By.xpath("//div/input[2]"));
//		
//		//AD  one option pipeline used
//		driver.findElement(By.xpath("//div[1]/input[1]|//div[2]/input[2]"));
//		//BC
//		driver.findElement(By.xpath("//div[1]/input[2]|//div[2]/input[1]"));
		
		//*****************************************************************************
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//td[1]/input[1]")).sendKeys("nabinmaity@ymail.com");
		driver.findElement(By.xpath("//td[2]/input")).sendKeys("iaminlove");
		driver.findElement(By.xpath("//label/input")).click();

	//********************************************************************************

	}

}
