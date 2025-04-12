package Pages;

import org.openqa.selenium.WebDriver;

import AutomationPages.Home;
import AutomationPages.Login;

public class PageObjectManager {
   private WebDriver driver;
   private GUIPage gui;
   private WindowHandling TabWindow;
   private MouseAction mouse;
   private Home HM;
   private Login LG;
   
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
   
   public Home getHome() {
	   HM = new Home(driver);
	   return HM;
   }
   
   public Login getLogin() {
	   LG = new Login(driver);
	   return LG;
   }
   
   
   
   
}
