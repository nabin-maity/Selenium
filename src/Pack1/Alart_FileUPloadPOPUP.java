package Pack1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alart_FileUPloadPOPUP {
	// TODO Auto-generated constructor stub
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver	();
	driver.get("https://www.naukri.com/");
//	WebElement uploadcv = driver.findElement(By.xpath("//input[@id='input_resumeParser']"));
//	File CV = new File("./CV/Nabin.docx");
//	String path = CV.getAbsolutePath();
//	uploadcv.sendKeys(path);
	//*****************************************************//
	
	//Monster India Assignment
	//driver.get("https://www.monsterindia.com/");
}

}
