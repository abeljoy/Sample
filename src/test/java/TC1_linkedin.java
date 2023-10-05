import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.loginPage;
import base.baseClass;

public class TC1_linkedin extends baseClass {
	
	baseClass browser;
	loginPage loginpage;
	@BeforeMethod
	public void beforeMethod() throws MalformedURLException {
		browser.setUp();
	}
	@Test
	public void  verifyLogin() {
		loginpage.verifyLoginPageDisplayed();
		loginpage.login();
		
	}
}
