package Pom;

import javax.swing.Spring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFacebookPage {
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	
	@FindBy(id="loginbutton")
	private WebElement loginbutton;
	
	public LoginFacebookPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}
	
	public void setpassword(String pwd)
	{
		this.password.sendKeys(pwd);
	}
	
	public void setloginbutton()
	{
		this.loginbutton.click();
	}

}
