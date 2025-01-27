package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestContext 
{
	private PageObjectManager pageobjectmanager;
	WebDriver driver;

	public WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		return driver;
	}
	
	public WebDriver getedgeDriver() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		return driver;
	}
	
	public PageObjectManager getPageObjectManager() {
		pageobjectmanager = new PageObjectManager(driver);
		return pageobjectmanager;
	}
	
	
}
