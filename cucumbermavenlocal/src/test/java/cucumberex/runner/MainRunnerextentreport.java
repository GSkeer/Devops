package cucumberex.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\gsk3\\Documents\\Cucumber\\cucumbermavenlocal\\src\\test\\java\\cucumberex\\featurefile\\validlogin"},
		glue = {"cucumberex.stepdefs.stepsvalidlogin"},
		monochrome =true,
		stepNotifications =true,
		dryRun=false,
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	
)
public class MainRunnerextentreport {
	

}
