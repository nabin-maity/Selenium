package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver	();
	driver.get("https://www.seleniumhq.org/download/");
	
	//td[text()='Java']
	//td[text()='3.141.59']
	//td[contains(text(),'3.141.59')]
	//******************************Independent dependent X path****************
	//td[text()='Java']/../td[2]
	
	//for C#
	//td[text()='C#']
	//version
	//td[text()='C#']/../td[2]
	//date
	//td[text()='C#']/../td[3]
	
	//for ruby
	//td[text()='Ruby']
	//version
	//td[text()='Ruby']/../td[2]
	//data
	//td[text()='Ruby']/../td[3]
	
	
	//for python
	//td[text()='Python']
	//for version
	//td[text()='Python']/../td[2]
	//for Date
	//td[text()='Python']/../td[3]
	
	//**************** Flipkart ******************
	
	//GroupINDEX
	//  (//a[contains(text(),'Kraasa Solid Casuals For Men')])[1]
	//For Price  groupindex with independent xpath
//	(//a[contains(text(),'Kraasa Solid Casuals For Men')])[1]/..//div[@class='_1vC4OE']
	
	//indicate decendent(going to parent) / for child
	
	//a[contains(text(),'Oricum Multicolor-678 Sneakers For Men')]/..//div[@class='_1vC4OE']
	
	

	}

}
