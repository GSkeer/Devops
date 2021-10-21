package cucumberex.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\gsk3\\Documents\\Cucumber\\cucumbermavenlocal\\src\\test\\java\\cucumberex\\featurefile\\bothlogin\\bothlogin.feature"},
		glue = {"cucumberex.stepdefs.stepsbothlogin"},
		monochrome =true,
		stepNotifications =true,
		dryRun=false,
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
	
)
public class MainRunnerboth {
	

}
