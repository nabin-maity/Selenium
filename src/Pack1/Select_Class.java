package Pack1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/nonveg.html");
		WebElement food = driver.findElement(By.id("khans"));
		Select s = new Select(food);
		s.selectByValue("i");
		s.selectByIndex(2);
		s.selectByVisibleText("paperdry");
		s.deselectAll();
		
		//*****************get all selected will give only selected option**************
	List<WebElement> li = s.getAllSelectedOptions();
		for(WebElement loopvariable:li)
	{
			System.out.println(loopvariable.getText());
		}
		
	List<WebElement> list = s.getOptions();
		
		for(WebElement loopvariable:list)
		{
		System.out.println(loopvariable.getText());	
		}
		
		
		driver.findElement(By.xpath("//option[text()='lemonchicken']")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		driver.findElement(By.xpath("//option[text()='biryani']")).click();
		
}
}