package Pack1;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickUsingAction {
	static

	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
	WebDriver driver = new ChromeDriver	();

	
//	driver.get("https://demo.actitime.com");
//	driver.manage().window().maximize();
//	WebElement element = driver.findElement(By.linkText("actiTIME Inc."));
//	Actions a = new Actions(driver);
//	//a.moveToElement(element).perform();
//	a.contextClick(element).perform();
//	
//	Robot r =new Robot();
////	r.keyPress(KeyEvent.VK_W);
////	r.keyRelease(KeyEvent.VK_W);
//
//	r.keyPress(KeyEvent.VK_T);
//	r.keyPress(KeyEvent.VK_T);
	
	
	//**************************DoubleClick******************
	driver.get("file:///C:/Users/user/Desktop/doubleclick.html");
	WebElement element = driver.findElement(By.id("demo"));
//	Actions a =new Actions(driver);
	Actions a=new Actions(driver);
	
	
	a.doubleClick(element).perform();
	
}
}