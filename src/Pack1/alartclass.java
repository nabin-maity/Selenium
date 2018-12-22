package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alartclass {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver	();
	driver.get("https://demo.actitime.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	System.out.println(driver.getTitle());
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("//a[@class='content users']")).click();
	driver.findElement(By.xpath("//div[@class='addUserButton beigeButton useNativeActive']")).click();
	driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Nabin");
	driver.findElement(By.id("closeUserDataLightBoxBtn")).click();
	Alert a=driver.switchTo().alert();
//	a.accept();
//	a.dismiss();

	System.out.println(a.getText());
			

}
}