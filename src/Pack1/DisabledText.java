package Pack1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledText {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/xpath5.html");
		 //WebElement textbox = driver.findElement(By.xpath("//input[@id='t1']"));
		
		 JavascriptExecutor j =(JavascriptExecutor)driver;
		 j.executeScript("document.getElementById('t1').value='Nabin'");
		 
		
}
}