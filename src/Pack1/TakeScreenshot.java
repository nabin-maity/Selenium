package Pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	WebDriver driver = new ChromeDriver	();
	driver.get("https://www.facebook.com/");
	
	TakesScreenshot t =(TakesScreenshot)driver;
    File source = t.getScreenshotAs(OutputType.FILE);
	//File source = t.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Pic/Fb.png");
	FileUtils.copyFile(source, dest);

	
	
	
	
	
	

    
}
}