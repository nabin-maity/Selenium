package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBY {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver	();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement copyright = driver.findElement(By.xpath("//span[contains(text(),' Facebook')]"));
	int X = copyright.getLocation().getX();
	int Y = copyright.getLocation().getY();
	
	//For ScrollBy we need java script executer........... first we need to down cast to javascript interphase 
	
	JavascriptExecutor j = (JavascriptExecutor)driver;
	//j.executeScript("window.scrollBy(0,818)");
	j.executeScript("window.scrollBy("+X+","+Y+")");

    
}
}