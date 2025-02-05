package Pages;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin = {"html:target/Report.html"},features = "src/test/resources/MouseAction.feature",glue = {"mouseAction"},tags = "@smoke")
public class Runner extends AbstractTestNGCucumberTests {
	

//Parallel testing
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
		
	}
	
}   


