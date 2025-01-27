package mouseAction;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Pages.MouseAction;
import Pages.PageObjectManager;
import Pages.TestContext;
import io.cucumber.java.en.Given;

public class MouseActionSteps {
	
	 WebDriver driver;
	 PageObjectManager Page;
	 MouseAction mouse;
	
	@Given("Open test automation practice page {string} and {int}")
	public void open_test_automation_practice_page_and_rownum(String sheetname, int rownum) {
		TestContext context = new TestContext();
		driver = context.getChromeDriver();
		Page = context.getPageObjectManager();
		mouse = Page.getMouseAction();	
		String url = utility.ExcelUtil.getcelldata(sheetname, rownum, 0);
		mouse.openpage(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Given("Click on mouse hover")
	public void click_on_mouse_hover() throws InterruptedException {
		Thread.sleep(3000);
	   mouse.MouseHover();
	}
	@Given("Double click on copy text button")
	public void double_click_on_copy_text_button() throws InterruptedException {
		Thread.sleep(3000);
	    mouse.CopyTextButton();
	}
	@Given("Perform drag and drop option")
	public void perform_drag_and_drop_option() {
	    mouse.DragElement();
	}
	
	@Given("Perform slider action")
	public void SliderAction() {
		mouse.SliderBar();
	}
	
	@Given("Scrolling dropdown")
	public void Scrollingdropdown() {
		mouse.Scrollingdropdown();
	}
	
}
