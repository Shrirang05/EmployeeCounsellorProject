package Pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
   private WebDriver driver;
   private GUIPage gui;
   private WindowHandling TabWindow;
   private MouseAction mouse;
   
   public PageObjectManager (WebDriver driver)
   {
	   this.driver=driver;
   }
   
   public GUIPage getGUIPage()
   {
//	   return (login == null) ? login = new EmployeeLogin(driver) : login;
	   gui = new GUIPage(driver);
	   return gui;
   }
   
   public WindowHandling getTabandWindow() {
	   TabWindow = new WindowHandling(driver);
	   return TabWindow;
   }
   
   public MouseAction getMouseAction() {
	   mouse = new MouseAction(driver);
	   return mouse;
   }
   
   
   
   
   
   
   
   
}
