package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildbrowserPop {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver	();
	driver.get("https://www.naukri.com/");

}
}