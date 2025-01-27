package windowHandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import Pages.PageObjectManager;
import Pages.TestContext;
import Pages.WindowHandling;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import junit.framework.Assert;

public class TabAndWindowHandlingSteps 
{
  WebDriver driver;
  WindowHandling TabWindow;
  PageObjectManager Page;
	 
 
	@Given("Open test automation practice page {string} and {int}")
	public void OpenGUIPage(String sheetname, int rownum)
	{
		TestContext context = new TestContext();
		driver = context.getChromeDriver();
		Page = context.getPageObjectManager();
		TabWindow = Page.getTabandWindow();	
		String url = utility.ExcelUtil.getcelldata(sheetname, rownum, 0);
		TabWindow.openpage(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@And ("Click on new tab")
	public void ClickOnNewTab()
	{
		TabWindow.ClickOnNewTab();
		List<String>ids = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));
	}
	
	@And("Verify new tab open")
	public void VerifyNewTabOpen()
	{
		String Actualurl = TabWindow.Verifynewtabopen();
		String Expectedurl = "https://demo.opencart.com/";	
	    Assert.assertEquals(Actualurl, Expectedurl);
	}
	
	@And("Click on CloudFlare")
	public void ClickOnCloudFlare() throws InterruptedException
	{
		TabWindow.Clickoncloudflare();
		List<String>ids = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ids.get(2));
		driver.close();
		Thread.sleep(3000);
		
		List<String>ids1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));
		driver.close();
		Thread.sleep(3000);
		
		
		List<String>ids0 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ids.get(0));
		Thread.sleep(3000);
//		driver.switchTo().defaultContent();
	}
	
	@And("Click on popup window")
	public void ClickOnPopupWindow() throws InterruptedException {
		TabWindow.ClickOnPopupWindow();
		List<String>ids = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@When("Verify new window open")
	public void VerifyNewwindowopen()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Actualtext = TabWindow.VerifyNewWindowOpen();
		String Expectedurl = "Selenium automates browsers. That's it!";	
		Assert.assertEquals(Actualtext, Expectedurl);
	}
	
	@Then("Click on Download button")
	public void ClickOnDownload()
	{
		TabWindow.ClickOnDownload();
		List<String>ids = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ids.get(0));
	}
	
	
	//Tabs(Wikipedia) Testing
	
	@Given("Enter into searchbox")
	public void enter_into_searchbox() {
		TabWindow.WikiSearchBox();
	}
	@Given("Click on search button")
	public void click_on_search_button() {
	   TabWindow.SearchButton();
	}
	@Given("Click on Testing from Wikipedia search result")
	public void click_on_testing_from_wikipedia_search_result() {
		TabWindow.ClickOnTestingFromResult();
	}
	
	
	
	
	
	
}
