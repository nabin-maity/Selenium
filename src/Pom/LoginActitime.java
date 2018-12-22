package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginActitime {
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	
//	public WebElement getUsername() {
//		return username;
//	}
//
//
//	public void setUsername(WebElement username) {
//		this.username = username;
//	}
//
//
//	public WebElement getPassword() {
//		return password;
//	}
//
//
//	public void setPassword(WebElement password) {
//		this.password = password;
//	}
//
//
//	public WebElement getLoginbutton() {
//		return loginbutton;
//	}
//
//
//	public void setLoginbutton(WebElement loginbutton) {
//		this.loginbutton = loginbutton;
//	}

	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}

	public void setpassword(String pw)
	{
		this.password.sendKeys(pw);
	}
	
	public void setloginbutton()
	{
		this.loginbutton.click();
	}

	
	public LoginActitime(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}

}
