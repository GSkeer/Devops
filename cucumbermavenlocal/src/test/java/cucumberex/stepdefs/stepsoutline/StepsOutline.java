package cucumberex.stepdefs.stepsoutline;

import org.openqa.selenium.WebDriver;

import framework.constants.UIConstants;
import framework.factory.DriverFactory;
import framework.factory.PageProvider;
import framework.pageobject.HomePage;
import framework.pageobject.LoginPage;
import framework.utils.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsOutline {
	
	WebDriver driver;
	HomePage homepage;
	LoginPage loginpage;
	
	@Before
	public void setUP() {
		driver =DriverFactory.getDriver();
		driver.get(new PropertyReader().getProperty(UIConstants.BASE_URL));
		loginpage =new PageProvider(driver).getLoginPage();
		homepage= new PageProvider(driver).getHomePage();
	}
	
	@Given("The user clicks on the Sign in link")
	public void theUserClicksOnTheSignInLink() {
		homepage.clickSignIn();
	   
	}

	@Given("^The user enters the email([A-Za-z0-9@.]*)$")
	public void theUserEntersTheEmail(String email) {
		loginpage.enterUserName(email);
	   
	}

	@Given("The user enters the password([^\\\"]*) $\")")
	public void theUserEntersThePassword(String password) {
	   loginpage.enterPassword(password); 
	}

	@When("The user clicks on the sign in button")
	public void theUserClicksOnTheSignInButton() {
		loginpage.clickSignInButton();
	    
	}

	@Then("^Login should([^\"]*) $")
	public void loginShouldBeSuccess(String status) {
		
		if(status.equalsIgnoreCase("Success")) {
			homepage.isAddressesLinkVisible();
		}else {
			loginpage.validateErrorMessgeShown("Bad email or password");
		}
	    
	}

	
	@After
	public void teardown() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		driver.close();
		driver.quit();
	}
	




}
