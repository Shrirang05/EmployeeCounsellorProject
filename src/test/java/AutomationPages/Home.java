package AutomationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home 
{
	WebDriver driver;
	Select SE;
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy (xpath = "//img[@alt='Website for automation practice']")
	WebElement AutomationLogo;
	
	@FindBy (xpath = "//a[text()=' Signup / Login']")
	WebElement LoginButton;
	
	@FindBy (xpath = "//div[@class='signup-form']//h2")
	WebElement Signuptext;
	
	@FindBy (xpath = "//input[@placeholder='Name']")
	WebElement SignUpName;
	
	@FindBy (xpath = "//input[@data-qa='signup-email']")
	WebElement SignUPEmail;
	
	@FindBy (xpath = "//button[normalize-space()='Signup']")
	WebElement SignUP;
	
	@FindBy (xpath = "//h2[@class='title text-center']//b")
	WebElement AcctInform;
	
	@FindBy (xpath = "//input[@id='id_gender1']")
	WebElement Title;
	
	@FindBy (xpath = "//input[@id='password']")
	WebElement SignupPass;
	
	@FindBy (id="days")
	WebElement DOBDay;
	
	@FindBy (id="months")
	WebElement DOBMonths;
	
	@FindBy (id="years")
	WebElement DOBYears;
	
	@FindBy (id="newsletter")
	WebElement Checkboxofnewsletter;
	
	@FindBy (id="optin")
	WebElement Secondcheckbox;
	
	@FindBy (id="first_name")
	WebElement FirstName;
	
	@FindBy (id="last_name")
	WebElement LastName;
	
	@FindBy (id="company")
	WebElement Company;
	
	@FindBy (id="address1")
	WebElement Address1;
	
	@FindBy (id="address2")
	WebElement Address2;
	
	@FindBy (id="country")
	WebElement Country;
	
	@FindBy (id="state")
	WebElement State;
	
	@FindBy (id="city")
	WebElement City;
	
	@FindBy (id="zipcode")
	WebElement Zipcode;
	
	@FindBy (id="mobile_number")
	WebElement MobileNo;
	
	@FindBy (xpath="//button[normalize-space()='Create Account']")
	WebElement CreateAccount;
	
	@FindBy (xpath="//a[normalize-space()='Continue']")
	WebElement ContinueButton;
	
	@FindBy (xpath="//header[@id='header']//li[10]//a[1]")
	WebElement VerifyAccountCr;
	
	@FindBy (xpath="//a[normalize-space()='Delete Account']")
	WebElement DeleteAccount;
	
	
	public void NavigatetoPage(String url) {
		driver.get(url);
	}
	
	public String VerifyAutomationLogo() {
//		Boolean autologo = AutomationLogo.isDisplayed();
		String ActualLogo= AutomationLogo.getAttribute("alt");	
		return ActualLogo;	
	}
	
	public Boolean VerifyLogoDispaly() {
		Boolean autologo = AutomationLogo.isDisplayed();
		return autologo;
	}
	
	public void ClickonLogin() {
		LoginButton.click();
	}
	
	public String VerifySignuptext() {
		String actualtext = Signuptext.getText();
		return actualtext;
	}
	
	public void EnterSignUpname(String Name, String Email) {
		SignUpName.sendKeys(Name);
		SignUPEmail.sendKeys(Email);
	}
	
	public void ClickOnSignupButton()
	{
		SignUP.click();
	}
	
	public String VerfiyEnterAccInfo()
	{
		String ActualText = AcctInform.getText();
		return ActualText;
	}
	
	public void ClickOnTitle()
	{
		Title.click();
	}
	
	public void EnterPass(String Pass)
	{
		SignupPass.sendKeys(Pass);
	}
	
	public void SelectDay()
	{	
		SE = new Select(DOBDay);
		SE.selectByIndex(20);
	}
	
	public void SelectMonth()
	{	
		SE = new Select(DOBMonths);
		SE.selectByIndex(6);
	}
	
	public void SelectYear()
	{	
		SE = new Select(DOBYears);
		SE.selectByValue("1998");
	}
	
	public void Newscheckbox()
	{
		Checkboxofnewsletter.click();
	}
	
	public void secondcheckbox() {
		Secondcheckbox.click();
	}
	
	public void FirstName(String FName) {
		FirstName.sendKeys(FName);
	}
	
	public void LastName(String LName)
	{
		LastName.sendKeys(LName);
	}
	
	public void Company(String company)
	{
		Company.sendKeys(company);
	}
	
	public void Address1(String address1)
	{
		Address1.sendKeys(address1);
	}
	
	public void Address2(String address2)
	{
		Address2.sendKeys(address2);			
	}
	
	public void Country()
	{
		SE = new Select(Country);	
		SE.selectByIndex(1);
	}
	
	public void EnterState(String state)
	{
		State.sendKeys(state);
	}
	
	public void EnterCity(String city)
	{
		City.sendKeys(city);
	}
	
	public void Zipcode(String zipcode)
	{
		Zipcode.sendKeys(zipcode);
	}
	
	public void MobileNo(String MobNo)
	{
		MobileNo.sendKeys(MobNo);
	}
	
	public void CreateAccount()
	{
		CreateAccount.click();
	}
	
	public void ContinueButton()
	{
		ContinueButton.click();
	}
	
	public String VerifyLoggedIn() {
		String Actualtext = VerifyAccountCr.getText();
		return Actualtext;
	}
	
	public void ClickOnDeleteAcct()
	{
		DeleteAccount.click();
	}
	
}
