package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public WebDriver ldriver;
	 public Loginpage(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
		 
	 }
	@FindBy(id="username")
	@CacheLookup
	 WebElement username;
	
	@FindBy(id="password")
	@CacheLookup
	 WebElement password;
	
	@FindBy(id="log-in")
	@CacheLookup
	 WebElement login;
	
	public void setUsername(String uname)
	{
		username.clear();
		username.sendKeys(uname);
	}
	public void setPassword(String pword)
	{
		username.clear();
		username.sendKeys(pword);
	}
	public void clicklogin()
	{
		
		username.click();
	}
	
}
