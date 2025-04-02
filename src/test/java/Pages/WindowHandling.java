package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WindowHandling 
{
	//*[text()='New Tab']
	
	WebDriver driver;
	
	public WindowHandling(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy (how=How.XPATH,using="//*[text()='New Tab']")
	WebElement NewTab;
	
	@FindBy (how=How.ID,using="PopUp")
	WebElement PopupWindow;
	
	@FindBy(how=How.XPATH,using="//*[@class='d-1 fw-bold']")
	WebElement VerifyNewWindow;
	
	@FindBy(how=How.XPATH,using="(//a[contains(text(),'Cloudflare')])[1]")
	WebElement CloudFlare;
	
//	@FindBy(how=How.XPATH,using="//span[normalize-space()='Downloads123']")
//	List<WebElement> Download123;
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Downloads']")
	WebElement Download;
	
	public void openpage(String url) {
		driver.get(url);
	}
	
	public void ClickOnNewTab() {
		NewTab.click();
	}
	
	public String Verifynewtabopen() 
	{
		String url = driver.getCurrentUrl();		
		return url;
	}
	
	public void Clickoncloudflare() {
		CloudFlare.click();
	}
	
	public void ClickOnPopupWindow() {
		PopupWindow.click();
	}
	
	public String VerifyNewWindowOpen() {
	     String Actualtext = VerifyNewWindow.getText();
	     return Actualtext;
	}
	
	public void ClickOnCloudFlare() {
		CloudFlare.click();
	}
	
	public void ClickOnDownload() {
		Download.click();
	}
	
	
	//Tabs(Wikipedia) Testing
	
	@FindBy (how=How.ID,using="Wikipedia1_wikipedia-search-input")
	WebElement WikipediaSearhBox;
	
	@FindBy (how=How.XPATH,using="//*[@class='wikipedia-search-button']")
	WebElement WikipediaSearhButton;
	
	@FindBy (how=How.XPATH,using="Wikipedia1_wikipedia-search-results")
	List<WebElement> WikipediaResults;
	
	
	public void WikiSearchBox() {
		WikipediaSearhBox.sendKeys("Testing");
	}
	
	public void SearchButton() {
		WikipediaSearhButton.click();
	}
	
	public void ClickOnTestingFromResult() {
		for (WebElement element : WikipediaResults) {
			if(element.getText().equals("Testing effect"))
			{
				element.click();
				break;
			}
		}
	}
	
	
	
}
