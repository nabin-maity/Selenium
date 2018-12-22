package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	
		static
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		}
		
		
		public static void main(String[] args)
		{
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///C:/Users/user/Desktop/notes.html");
			//WebElement a = driver.findElement(By.id("t1"));
			//a.click();
//			driver.findElement(By.name("d1")).click();
//			driver.findElement(By.tagName("a")).click();
//			driver.findElement(By.className("c1")).click();
//			driver.findElement(By.linkText("Google")).click();
			driver.findElement(By.partialLinkText("Google")).click();
			
			
		}
		
			
}
