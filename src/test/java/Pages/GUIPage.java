package Pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GUIPage {

	WebDriver driver;
	public Select se;
	
	public GUIPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy (how=How.ID,using="name")
	WebElement Name;
	
	@FindBy (how=How.ID,using="email")
	WebElement Email;
	
	@FindBy (how=How.ID,using="phone")
	WebElement Phone;
	
	@FindBy (how=How.ID,using="textarea")
	WebElement Address;
	
	@FindBy (how=How.ID,using="male")
	WebElement Gender;
	
	@FindBy (how=How.ID,using="sunday")
	WebElement DaysS;
	
	@FindBy (how=How.ID,using="monday")
	WebElement DayM;
	
	@FindBy (how=How.ID,using="saturday")
	WebElement DaySaturday;
	
	@FindBy (how=How.ID,using="country")
	WebElement Country;
	
	@FindBy (how=How.ID,using="colors")
	WebElement Colors;
	
	@FindBy (how=How.ID,using="animals")
	WebElement SortedList;
	
	@FindBy (how=How.ID,using="datepicker")
	WebElement DatePicker1;
	
	@FindBy (how=How.ID,using="alertBtn")
	WebElement Simplealert;
	
	@FindBy (how=How.ID,using="confirmBtn")
	WebElement confirmalert;
	
	@FindBy (how=How.ID,using="promptBtn")
	WebElement promptalert;
	
	@FindBy (how=How.ID,using="txtDate")
	WebElement DatePicker2;
	
	@FindBy (how=How.XPATH,using="//*[@class='ui-datepicker-month']")
	WebElement MonthfromCalendar;
	
	@FindBy (how=How.XPATH,using="//*[@class='ui-datepicker-year']")
	WebElement YearfromCalendar;
	
	@FindBy (how=How.XPATH,using="//*[@class='ui-datepicker-calendar']//tbody//tr//td//a")
	List<WebElement> Datefrompicker2;
	
	@FindBy (how=How.ID,using="singleFileInput")
	WebElement ChooseSingleFileUpload;
	
	@FindBy (how=How.ID,using="multipleFilesInput")
	WebElement ChooseMultipleFileUpload;
	
	@FindBy (how=How.XPATH,using="//button[text()='Upload Single File']")
	WebElement Singlefileupload;
	
	@FindBy (how=How.XPATH,using="//button[text()='Upload Multiple Files']")
	WebElement Multiplefileupload;
	
	
	public void openpage(String url) {
		driver.get(url);
	}
	
	public String verifypage() {
		String actualtitle = driver.getTitle();
		return actualtitle;
	}
	
	
	public void Name(String name) {	
		Name.sendKeys(name);
	}
	
	public void Email(String email) {
		Email.sendKeys(email);
	}
	
	public void Phone(String phone) {
		Phone.sendKeys(phone);
	}
	
	public void Address(String address) {
		Address.sendKeys(address);
	}
	
	public void Gender() {
		Gender.click();
	}
	
	public void Sunday() {
		DaysS.click();
	}
	
	public void Monday() {
		DayM.click();
	}
	
	public void Saturday() {
		DaySaturday.click();
	}
	
	public void Country() {
	  se=new Select(Country);
	  se.selectByValue("uk");
		
	}
	
	public void Colors() {
		se=new Select(Colors);
		se.selectByValue("white");
	}
	
	public void SortedList() {
		se=new Select(SortedList);
		se.selectByValue("fox");
	}
	
	public void DatePicker1(String dateone) {
		DatePicker1.sendKeys(dateone);
	}
	
	public void simplealert() {
		Simplealert.click();
		driver.switchTo().alert().accept();
	}
	
	public void confirmalert() {
		confirmalert.click();
		driver.switchTo().alert().accept();
	}
	
	public void promptalert() {
		promptalert.click();
		Alert alert= driver.switchTo().alert();
		alert.sendKeys("Promt alert");
		alert.accept();
	}
	
	public void datepicker2() {
		DatePicker2.click();
	}
	
	public void SelectMonth() {
		se = new Select(MonthfromCalendar);
		se.selectByVisibleText("Apr");
	}
	
	public void SelectYear() {
		se = new Select(YearfromCalendar);
		se.selectByVisibleText("2026");
	}
	
	public void SelectDate() {
		String Date = "12";
		
		for(WebElement dt: Datefrompicker2)
		{
			if(dt.getText().equals(Date))
			{
				dt.click();
				break;
			}
		}
	
	}
	
	public void ChooseSingleFileUpload() {
		String file1 = "C:\\Users\\shrirang.ladda\\Downloads\\dummy.pdf";
		
		ChooseSingleFileUpload.sendKeys(file1);
	}
	
	public void ChooseMultipleFileUpload() {
		String file1 = "C:\\Users\\shrirang.ladda\\Downloads\\dummy.pdf";
		String file2 = "C:\\Users\\shrirang.ladda\\Downloads\\sample.pdf";
		ChooseMultipleFileUpload.sendKeys(file1+"\n"+file2);
	}
	
	public void Singlefileupload() {
		Singlefileupload.click();
	}
	
	public void MultiplefileUpload() {
		Multiplefileupload.click();
	}
	
	
	
	
	
}
