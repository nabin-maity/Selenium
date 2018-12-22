package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GeolocationPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	option.addArguments("--disable-geolaction");
	WebDriver driver = new ChromeDriver(option);
		
//	WebDriver driver = new ChromeDriver	();
	driver.get("https://www.cleartrip.com/");
	
	
	
	}
}
