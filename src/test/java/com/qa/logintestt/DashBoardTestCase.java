package com.qa.logintestt;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseclasss.BaseClass;
import com.qa.pages.DashBoard;
import com.qa.pages.LoginPage;
import com.qa.pages.SeleniumPdf;
public class DashBoardTestCase extends BaseClass {
	LoginPage log;
	DashBoard dash;
	SeleniumPdf selpdf;
	public DashBoardTestCase() {
		super();	
	}	
  @BeforeMethod
  public void setup(){
	   initilization();
	  log=new LoginPage();
	  selpdf= new SeleniumPdf();
	  dash= log.login(prop.getProperty("username"),prop.getProperty("password"));  
  }
  @Test (priority = 2,enabled = true)
  public void verifyOperatorPage() {
	  String act= dash.Operate1();
	  Assert.assertEquals(act, "Operators" );
  }
   @Test (priority =1,enabled = true)
  public void  verifySeleniumPage() {
	   selpdf =dash.MoreInfo1Click();
	String acturl=driver.getCurrentUrl();
	  Assert.assertEquals(acturl, "file:///C:/Offline%20Website%20selenium/pages/examples/dashboard.html");	  
  } 
  @Test (priority = 3, enabled = true)
  public void verifyLogoff() {
	  log = dash.Logoff();
	  String actMainPage=driver.getTitle();
	  Assert.assertEquals(actMainPage, "JavaByKiran | Log in");
  }
}
