package Pages;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin = {"html:target/Report.html"},features = "src/test/resources/MouseAction.feature",glue = {"mouseAction"})
public class Runner extends AbstractTestNGCucumberTests {}   


