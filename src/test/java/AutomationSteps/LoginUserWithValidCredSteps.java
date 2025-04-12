package AutomationSteps;

import org.openqa.selenium.WebDriver;

import AutomationPages.Home;
import AutomationPages.Login;
import Pages.PageObjectManager;
import Pages.TestContext;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginUserWithValidCredSteps 
{
	WebDriver driver;
	private PageObjectManager Page;
	private Home HM;
	private Login LG;
	
	@And("Verify that home page is visible successfully {string}")
	public void verifyhomepage(String ExpLogo)
	{
//		TestContext context = new TestContext();
//		driver = context.getChromeDriver();
//		Page = context.getPageObjectManager();
		HM = Page.getHome();
		LG = Page.getLogin();
		String ActualLogo = HM.VerifyAutomationLogo();
		Assert.assertEquals(ExpLogo, ActualLogo);
		System.out.println("Veify logo");
	}
	
	
	@And("Enter correct email address and password {string} and {string}")
	public void EnterUserandPass(String Email, String Pass)
	{

		LG.EnterLoginMailandPass(Email, Pass);
	}
	
	@When("Click on login button")
	public void ClickonLogin()
	{
		LG.ClickonLogin();
	}
	
	@Then("Verify that Logged in as username is visible")
	public void VerifyLoginSuccess() {
		HM.VerifyLoggedIn();
	}
	

}
