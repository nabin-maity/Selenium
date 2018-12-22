package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement Block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement Block3= driver.findElement(By.xpath("//h1[text()='Block 3']"));
	
	Actions a= new Actions(driver);
	Thread.sleep(3000);
	//a.dragAndDrop(Block1, Block3).perform();
	a.clickAndHold(Block1).moveToElement(Block3).release().perform();
		
		
	}
}
