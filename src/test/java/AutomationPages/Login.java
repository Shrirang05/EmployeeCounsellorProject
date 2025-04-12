package AutomationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login {
	WebDriver driver;
	Select SE;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy (xpath = "//*[@data-qa='login-email']")
	WebElement EmailAdd;
	
	@FindBy (xpath = "//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy (xpath = "//*[@data-qa='login-button']")
	WebElement Login;
	

	public void EnterLoginMailandPass(String email, String pass) {
		EmailAdd.sendKeys(email);
		Password.sendKeys(pass);
	}
	
	public void ClickonLogin() {
		Login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
