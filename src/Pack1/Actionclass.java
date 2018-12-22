package Pack1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver = new ChromeDriver	();
	driver.get("https://www.vtiger.com/");
	WebElement element = driver.findElement(By.id("menu-item-381"));
	Actions a = new Actions(driver);
	a.moveToElement(element).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Contact']")).click();
	WebElement contact = driver.findElement(By.xpath("(//div[@class='col-md-8 col-sm-8 col-xs-8 '])[2]"));
	System.out.println(contact.getText());
	driver.close();

}
	
}