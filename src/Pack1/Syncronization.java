package Pack1;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronization {


	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver	();
	driver.get("https://demo.actitime.com");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	System.out.println(driver.getTitle());
	driver.findElement(By.id("loginButton")).click();
//	Thread.sleep(5000);
	
	//**************************************************************************************
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	//Thread.sleep(4000);
	//wait.until(ExpectedConditions.titleContains("Enter"));//Enter is present in the page title
	//if title is method we will use we need to print the whole containt
	//wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	
	
	
	System.out.println(driver.getTitle());
	
    driver.findElement(By.id("logoutLink")).click();
    
    //*****************************************************************************
    //Fluent wait
    
    FluentWait fw =new FluentWait(driver);
    fw.pollingEvery(250,TimeUnit.MILLISECONDS);
    fw.withTimeout(20, TimeUnit.SECONDS);
    fw.ignoring(NoSuchElementException.class);
    fw.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
 
    
    
    driver.close();
	
	
	

    
}
}