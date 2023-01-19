package stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Loginpage;

public class Steps {
	
	WebDriver driver;
	public Loginpage lp;
	
	@Given("User launch crome browser")
	public void user_launch_crome_browser() {
		System.setProperty("webdriver.chrome.driver", "cgromedriver.exe");
		driver=new ChromeDriver();
		lp=new Loginpage(driver);
		
		
	}

	@When("User opens app url {string}")
	public void user_opens_app_url(String url) {
		driver.get(url);
	   
	}

	@Then("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String username, String password) {
	  lp.setUsername(username);
	  lp.setPassword(password);
	}

	@Then("click on login")
	public void click_on_login() {
		lp.clicklogin();
	   
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.findElement(By.id("amount")).isDisplayed())
		{
			assertEquals(title, driver.getTitle());
		}else
		{         
			driver.close();
			assertFalse(false);
		}
	  
	}

	@Then("user click on logout link")
	public void user_click_on_logout_link() {
	   driver.navigate().back();
	}

	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}
}
