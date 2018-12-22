package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath4 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver	();
//	driver.get("https://www.flipkart.com/");
//	driver.findElement(By.xpath("(//button)[2]")).click();;
//	Thread.sleep(2000);
//	List<WebElement> a = driver.findElements(By.xpath("//div[contains(text(),'Now ')]"));
//	System.out.println(a.size());
	
//	driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_EAIaIQobChMInsCTyZmK3wIVmiQrCh1dwgzDEAAYASAAEgKI3fD_BwE_k_&gclid=EAIaIQobChMInsCTyZmK3wIVmiQrCh1dwgzDEAAYASAAEgKI3fD_BwE");
//
//List<WebElement> lst = driver.findElements(By.xpath("//div[contains(text(),'Ends in ')]"));
//System.out.println(lst.size());
//driver.close();
	
	driver.get("https://www.plus2net.com/javascript_tutorial/enable-disable-demo.php");
	driver.manage().window().maximize();
WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));	
	WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//	Thread.sleep(3000);
//	System.out.println(checkbox.isSelected());
	checkbox.click();
//	System.out.println(checkbox.isSelected());
	
	System.out.println(textbox.isEnabled());
	textbox.sendKeys("Nabin");
	//driver.close();
	

	
	}
}