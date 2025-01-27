package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MouseAction {

	Actions act;
	WebDriver driver;
	
	public MouseAction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how=How.XPATH,using ="//*[@class='dropbtn']")
	WebElement MouseHover;
	
	@FindBy(how=How.XPATH,using ="//*[text()='Mobiles']")
	WebElement Mobile;
	
	@FindBy(how=How.XPATH,using ="//*[text()='Copy Text']")
	WebElement DoubleClickCopyText;
	
	@FindBy(how=How.XPATH,using ="//*[@id='draggable']")
	WebElement DragElement;
	
	@FindBy(how=How.XPATH,using ="//div[@id='droppable']")
	WebElement DropElement;
	
	@FindBy(how=How.XPATH,using ="//*[@class='ui-slider-handle ui-corner-all ui-state-default'][1]")
	WebElement Slider;
	
	@FindBy(how=How.ID,using ="comboBox")
	WebElement Scroller;
	
	@FindBy(how=How.XPATH,using ="//*[text()='Item 8']")
	WebElement ScrollDrpOption;
	
	
	public void openpage(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", MouseHover);
	}
	
	public void MouseHover() {
		act =new Actions(driver);
		act.moveToElement(MouseHover).perform();
		Mobile.click();	
	}
	
	public void CopyTextButton() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 500)"); 
		act =new Actions(driver);
		act.doubleClick(DoubleClickCopyText).perform();	
	}
	
	public void DragElement() {
		act.dragAndDrop(DragElement, DropElement).perform();
	}
	
	public void SliderBar() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)"); 
		act.dragAndDropBy(Slider, 100, 0).perform();
	}
	
	public void Scrollingdropdown() {
		Scroller.click();
		ScrollDrpOption.click();
	}
	
	
	
	
}
