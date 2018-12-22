package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath6 {
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
	System.out.println(X);
	System.out.println(Y);
	System.out.print(X +" "+ Y);
    driver.close();
    
}
}