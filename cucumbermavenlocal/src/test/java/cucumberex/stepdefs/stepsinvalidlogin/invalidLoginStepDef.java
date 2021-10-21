package cucumberex.stepdefs.stepsinvalidlogin;

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

public class invalidLoginStepDef {
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
	
	@Given("The user clicks on the sign in link")
	public void the_user_clicks_on_the_sign_in_link() {
	  homepage.clickSignIn();  
	}

	@Given("The user enters an invalid user name")
	public void theUserEntersAnInvalidUserName() {
		loginpage.enterUserName("keerags@gamil.com");
	    
	}

	@Given("The user enters an invalid password")
	public void theUserEntersAnInvalidPassword() {
		loginpage.enterPassword("test");
	    
	}
	
	@When("The user clicks on the sign in button")
	public void the_user_clicks_on_the_sign_in_button() {
		loginpage.clickSignInButton();
	   
	}

	@Then("Appropriate error message must be shown")
	public void appropriateErrorMessageMustBeShown() {
		loginpage.validateErrorMessgeShown("Bad email or password");
	    
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
