package AutomationSteps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import AutomationPages.Home;
import Pages.PageObjectManager;
import Pages.TestContext;
import Pages.WindowHandling;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import junit.framework.Assert;
import utility.ConfigReader;

public class RegisterUserSteps {

	private WebDriver driver;
	private PageObjectManager Page;
	private Home HM;
	
	@Given("Launch browser")
	public void OpenGUIPage()
	{
		TestContext context = new TestContext();
		driver = context.getChromeDriver();
		Page = context.getPageObjectManager();
		HM = Page.getHome();	
//		String url = utility.ExcelUtil.getcelldata(sheetname, rownum, 0);
//		TabWindow.openpage(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@And("Navigate to url")
	public void NavigatetoURL()
	{
//		String url = utility.ExcelUtil.getcelldata(sheetname, rownum, 0);
//		HM.NavigatetoPage(url);
		
		 String Loginurl = ConfigReader.getProperty("url");
		 HM.NavigatetoPage(Loginurl);
	}
	
	@And("Verify that home page is visible successfully {string} and {int}")
	public void VerifyPageOpen(String sheetname, int rownum)
	{
		String ActualLogo = HM.VerifyAutomationLogo();
		String ExpectedLogo = utility.ExcelUtil.getcelldata(sheetname, rownum, 0);
		Assert.assertEquals(ExpectedLogo, ActualLogo);
	    Boolean logodispaly = HM.VerifyLogoDispaly();
	    Assert.assertTrue("Logo should display", logodispaly);
	}
	
	@And("Click on Signup or login button")
	public void LoginButton()
	{
		HM.ClickonLogin();
	}
	
	@And("Verify new user signup is visible {string} and {int}")
	public void ValidateUserSignup(String sheetname, int rownum) {
		String ActualText = HM.VerifySignuptext();
		String ExpectedText = utility.ExcelUtil.getcelldata(sheetname, rownum, 1);
		Assert.assertEquals(ExpectedText, ActualText);
	}
	
	@And("Enter name and email address {string} and {int}")
	public void EnterNameandEmail(String sheetname, int rownum) throws InterruptedException 
	{   
		Thread.sleep(1000);
		String Name = utility.ExcelUtil.getcelldata(sheetname, rownum, 2);
		String Email = utility.ExcelUtil.getcelldata(sheetname, rownum, 3);
		Thread.sleep(3000);
		HM.EnterSignUpname(Name, Email);
		Thread.sleep(3000);
	}
	
	@And("Click signup button")
	public void SignupButton()
	{
		HM.ClickOnSignupButton();
	}
	
	@And("Verify that ENTER ACCOUNT INFORMATION is visible {string} and {int}")
	public void ActInfVisible(String sheetname, int rownum) {
		String ActualText = HM.VerfiyEnterAccInfo();
		String ExpectedText = utility.ExcelUtil.getcelldata(sheetname, rownum, 4);
		Assert.assertEquals(ExpectedText, ActualText);
	}
	
	@And("Fill details Title Name Email Password Date of birth {string} and {int}")
	public void FillDetails(String sheetname, int rownum) {
		HM.ClickOnTitle();
		String Pass = utility.ExcelUtil.getcelldata(sheetname, rownum, 5);
		HM.EnterPass(Pass);
		HM.SelectDay();
		HM.SelectMonth();
		HM.SelectYear();
	}
	
	@And("Select checkbox Sign up for our newsletter")
	public void ClickOnCheckbox() {
		HM.Newscheckbox();
	}
	
	@And("Select checkbox Receive special offers from our partners")
	public void Clickon2ndcheckbox() {
		HM.secondcheckbox();
	}
	
	@And("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number {string} and {int}")
	public void AddressInfoDetails(String sheetname, int rownum) {
		String firstname = utility.ExcelUtil.getcelldata(sheetname, rownum, 6);
		HM.FirstName(firstname);
		String lastname = utility.ExcelUtil.getcelldata(sheetname, rownum, 7);
		HM.LastName(lastname);
		String company = utility.ExcelUtil.getcelldata(sheetname, rownum, 8);
		HM.Company(company);		
		String address = utility.ExcelUtil.getcelldata(sheetname, rownum, 9);
		HM.Address1(address);
		String address2 = utility.ExcelUtil.getcelldata(sheetname, rownum, 10);
		HM.Address2(address2);
		HM.Country();
		String State = utility.ExcelUtil.getcelldata(sheetname, rownum, 11);
		HM.EnterState(State);
		String City = utility.ExcelUtil.getcelldata(sheetname, rownum, 12);
		HM.EnterCity(City);
		String zipcode = utility.ExcelUtil.getcelldata(sheetname, rownum, 13);
		HM.Zipcode(zipcode);
		String mobno = utility.ExcelUtil.getcelldata(sheetname, rownum, 14);
		HM.MobileNo(mobno);
	}
	
	@And("Click on Create Account button")
	public void CreateAccountButton() {
		HM.CreateAccount();
	}
	
	@And("Verify that ACCOUNT CREATED is visible {string} and {int}")
	public void VerifyAccountCreated(String sheetname, int rownum) {
		String ActualURL = driver.getCurrentUrl();
		String ExpURL = utility.ExcelUtil.getcelldata(sheetname, rownum, 15);
		Assert.assertEquals(ExpURL, ActualURL);
	}
	
	@And("Click Continue button")
	public void ContinueButton() {
		HM.ContinueButton();
	}
	
	@And("Verify that Logged in as username is visible {string} and {int}")
	public void VerifyLoggedIn(String sheetname, int rownum) {
		String ActualText = HM.VerifyLoggedIn();
		String ExpectedText = utility.ExcelUtil.getcelldata(sheetname, rownum, 16);
		Assert.assertEquals(ExpectedText, ActualText);
	}
	
	@And("Click Delete Account button")
	public void DeleteAcctButton() {
		HM.ClickOnDeleteAcct();
	}
	
	
	
}
