package cucumberex.stepdefs.stepsbglogin;

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

public class BGLoginStepDef {
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

	@Given("The user enters the user name")
	public void the_user_enters_the_user_name() {
		loginpage.enterUserName("avinashact1979@gmail.com");
	    
	}

	@Given("The user enters the password")
	public void the_user_enters_the_password() {
		loginpage.enterPassword("Sadu2006$");
	    
	}

	@When("The user clicks on the sign in button")
	public void the_user_clicks_on_the_sign_in_button() {
		loginpage.clickSignInButton();
	   
	}

	@Then("User should be able to login sucessfully")
	public void user_should_be_able_to_login_sucessfully() {
	  homepage.isAddressesLinkVisible();  
	}

	@Then("User click on the logout button")
	public void user_click_on_the_logout_button() {
	    homepage.clickSignOut();
	}
	
	@Given("The user enters an invalid user name")
	public void theUserEntersAnInvalidUserName() {
		loginpage.enterUserName("keerags@gamil.com");
	    
	}

	@Given("The user enters an invalid password")
	public void theUserEntersAnInvalidPassword() {
		loginpage.enterPassword("test");
	    
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
