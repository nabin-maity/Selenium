package Pack1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
//      ChromeDriver driver = new ChromeDriver();
		WebDriver driver =new ChromeDriver();
		
//********************************************************************************		
		
		//SearchContext driver =new ChromeDriver();
//        driver.get("https://en-gb.facebook.com/login/");
          //driver.manage().window().fullscreen();
         // driver.manage().window().maximize();
		
//        ***********************************************************************
		 // driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_EAIaIQobChMI_K_C3Yj23gIVgpOPCh1m9Qk6EAAYASAAEgLxuPD_BwE_k_&gclid=EAIaIQobChMI_K_C3Yj23gIVgpOPCh1m9Qk6EAAYASAAEgLxuPD_BwE");
          //driver.get("https://mail.google.com/mail/u/0/#inbox");
		  
//		 String url= driver.getCurrentUrl();
//		 System.out.println(url);
//		 String PageSourse =driver.getPageSource();
//		 System.out.println(PageSourse);
//		 Object title = driver.getTitle();
//		 System.out.println(title);

// *************************************************************************		
//		  driver.navigate().back();
//		  driver.navigate().forward();
//		 driver.navigate().to("https://www.naukri.com");
          
		 // driver.get("https://www.naukri.com");
//		  Set<String> alwh =driver.getWindowHandles();
//		  		  
//	  for(String loopvariable:alwh)
//		  			  
//		  {
//			  driver.switchTo().window(loopvariable);
//			 String Title= driver.getTitle();
//			  System.out.println(Title);
//			  
//			  if(Title.equals("Toppr") )
//			  {
//				  driver.close();
//			  }
//			  Thread.sleep(1000);
//		  }
//		  driver.close();
		
		  //System.out.println(alwh);
//*****************************************************************************	
		  
//		  driver.close();
//         driver.quit();
		  
//  driver.get("https://www.facebook.com/");
//  driver.manage().window().maximize();
//  driver.findElement(By.id("email")).sendKeys("nabinmaity@ymail.com");
//  driver.findElement(By.id("pass")).sendKeys("iaminlove");
// // driver.findElement(by.)
//  Thread.sleep(30004);
//  
//  driver.findElement(By.id("u_0_2")).click();
//  driver.manage().deleteAllCookies();
//  driver.close();
		
		
// *************************************************************************************	
//		
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("identifierId")).sendKeys("nabin241290@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("password")).sendKeys("Khanna@241290");
		driver.findElement(By.cssSelector("div[id='passwordNext']")).click();
		//driver.close();
		
		
  //**********************************************************************************
  
		//Using Css selector
		
//		driver.get("file:///C:/Users/user/Desktop/note2.html");
//		driver.findElement(By.cssSelector("input[tabindex='2']")).sendKeys("Nabin");
//		
		
//***********************************************************************************
		
		
		
	}

}
