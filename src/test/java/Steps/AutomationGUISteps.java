package Steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.GUIPage;
import Pages.PageObjectManager;
import Pages.TestContext;
import io.cucumber.java.en.*;

public class AutomationGUISteps {

	WebDriver driver;
	GUIPage gui;
	PageObjectManager Page;
	 
	@Given("Open test automation practice page {string} and {int}")
	public void OpenGUIPage(String sheetname, int rownum)
	{
		TestContext context = new TestContext();
		driver = context.getChromeDriver();
		Page = context.getPageObjectManager();
		gui = Page.getGUIPage();		
		String url = utility.ExcelUtil.getcelldata(sheetname, rownum, 0);
		gui.openpage(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Given("Verify correct page is open {string} and {int}")
	public void GUIPage(String sheetname, int rownum) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String Actualtitle = gui.verifypage();
		String Expectedtitle = utility.ExcelUtil.getcelldata(sheetname, rownum, 1);
		Assert.assertEquals(Actualtitle, Expectedtitle);
	}
	
	@And("Enter the name {string} and {int}")
	public void EnterName(String sheetname, int rownum)
	{
		String name = utility.ExcelUtil.getcelldata(sheetname, rownum, 2);
		gui.Name(name);
	}
	
	@And("Enter the Email {string} and {int}")
	public void Email(String sheetname, int rownum)
	{
		String email = utility.ExcelUtil.getcelldata(sheetname, rownum, 3);
		gui.Email(email);
	}
	
	@And("Enter the phone no {string} and {int}")
	public void Phoneno(String sheetname, int rownum)
	{
		String phoneno = utility.ExcelUtil.getcelldata(sheetname, rownum, 4);
		gui.Phone(phoneno);
	}
	
	@And("Enter the Address {string} and {int}")
	public void Address(String sheetname, int rownum)
	{
		String Address = utility.ExcelUtil.getcelldata(sheetname, rownum, 5);
		gui.Address(Address);
	}
	
	@And("Select gender")
	public void gender() 
	{
		gui.Gender();
	}
	
	@And("Select multiple days")
	public void selectsunday() {
		gui.Sunday();
		gui.Monday();
		gui.Saturday();
	}
	
	@And("Select the country from dropdown")
	public void selectcountry() {
		gui.Country();
	}
	
	@And("Select colors")
	public void SelectColours()
	{
		gui.Colors();
	}
	
	@And("Select Sorted list")
	public void sortedlist()
	{
		gui.SortedList();
	}
	
	@And("Enter the datepicker1 {string} and {int}")
	public void datepicker(String sheetname, int rownum)
	{
		String date = utility.ExcelUtil.getcelldata(sheetname, rownum, 6);
		gui.DatePicker1(date);
	}
	
	@And("handle simple alert")
	public void simplealert() 
	{
		try {
		Thread.sleep(2000);
		gui.simplealert();
		}
		catch(Exception ex) {	
		}
		
	}
	
	@And("handle confirmation alert")
	public void confirmationalert() 
	{
		gui.confirmalert();
		
	}
	
	@And("handle prompt alert")
	public void promptalert()
	{
		gui.promptalert();		
	}
	
	@Given("Click on date picker2")
	public void click_on_date_picker() {
	    gui.datepicker2();
	}
	@Given("Select month and Year")
	public void select_month_and_year() {
	    gui.SelectMonth();
	    gui.SelectYear();
	}
	@Given("Select Date")
	public void select_date() {
	    gui.SelectDate();
	}
	
	@And("Choose single file")
	public void UploadSingleFile()
	{
	     gui.ChooseSingleFileUpload();
	}
	
	@And("Choose multiple file")
	public void UploadMultipleFile()
	{
	    gui.ChooseMultipleFileUpload();	
	}
	
	@And("Upload single file")
	public void Clickonsinglefileupload()
	{
		gui.Singlefileupload();
	}
	
	@And("Upload multiple file")
	public void Clickonmultifileupload()
	{
		gui.MultiplefileUpload();
	}
	
	
	
	
}
