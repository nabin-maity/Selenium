package Pack1;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FiledownloadPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	}
	
	public static void main(String[] args) throws  Throwable 
	{
	//WebDriver driver = new ChromeDriver	();
		WebDriver driver = new FirefoxDriver();
	driver.get("https://www.seleniumhq.org/");
	driver.manage().window().maximize();
	driver.findElement(By.id("menu_download")).click();
	driver.findElement(By.xpath("//a[contains(text(),'3.141.59')]")).click();
	Robot r = new Robot();
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
	
	r.keyPress(KeyEvent.VK_ESCAPE);
	r.keyRelease(KeyEvent.VK_ESCAPE);
}
}