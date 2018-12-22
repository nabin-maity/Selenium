package Pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFetching {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable
	{
		
//		FileInputStream F = new FileInputStream("./Excel/Data.xlsx");
//		Workbook book = WorkbookFactory.create(F);
//		String username = book.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
//		 String Password = book.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
//		//System.out.println(login);
//		 WebDriver driver = new ChromeDriver();
//		 driver.get("https://demo.actitime.com/login.do;jsessionid=DC764E2B546DBE5A0391B7D5511AD582");
//		 driver.findElement(By.id("username")).sendKeys(username);
//		 driver.findElement(By.name("pwd")).sendKeys(Password);
//		 driver.findElement(By.id("loginButton")).click();
		 
		 //****************************Write Data in Excel Sheet**********************
		 
		 FileInputStream F = new FileInputStream("./Excel/Data.xlsx");
			Workbook book = WorkbookFactory.create(F);
			book.getSheet("sheet1").getRow(0).getCell(0).setCellValue("Nabin");
			FileOutputStream Fo = new FileOutputStream("./Excel/Data.xlsx");
			book.write(Fo);
			
			//it will get null pointer exception error text will replace another text we cannot write text in cell thats the draw back

}

	
}