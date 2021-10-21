package cucumberex.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\gsk3\\Documents\\Cucumber\\cucumbermavenlocal\\src\\test\\java\\cucumberex\\featurefile\\tags\\tags.feature"},
		glue = {"cucumberex.stepdefs.stepsbglogin"},
		monochrome =true,
		stepNotifications =true,
		dryRun=false,
		tags="@P0 and not @valid",
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
	
)
public class MainRunnertags {
	//tags="P0"
	//tags="@P0 or @P1"
	//tags="Regression" --->feature level
	//tags="@P0 and @valid"
	//tags="@P0 and not @valid"
	

}
