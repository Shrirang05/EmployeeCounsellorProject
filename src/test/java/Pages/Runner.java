package Pages;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},features = "src/test/resources/LoginUserwithValidCred.feature",glue = {"AutomationSteps"},tags = "@sanity")
public class Runner extends AbstractTestNGCucumberTests {
	
	//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:
	//html:target/Report.html

//Parallel testing
	
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();	
//	}
	
}   

