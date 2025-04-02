package Steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Pages.PageObjectManager;
import Pages.TestContext;
import io.cucumber.java.*;

public class Hooks 
{
 public static PageObjectManager page;
 public static WebDriver driver;

 @Before
 public void Setup()
 {
	   TestContext context = new TestContext(); 
	   driver=context.getChromeDriver(); 
	  page = context.getPageObjectManager();
     
 }

	@After
	public void teardown(Scenario scenario)
	{
		
		if (scenario.isFailed()) {
            // Take screenshot
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Failed Scenario Screenshot");
            } catch (Exception e) {
                System.err.println("Failed to capture screenshot: " + e.getMessage());
            }

            
		driver.close();
		
		
	}
	
	}
}
