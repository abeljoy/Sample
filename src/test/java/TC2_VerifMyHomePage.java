import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import base.baseClass;

public class TC2_VerifMyHomePage extends baseClass {
	baseClass browser;
	HomePage homepage;
	@BeforeMethod
	public void beforeMethod() throws MalformedURLException {
		browser.setUp();
	}
	
	@Test
	public void  verifyHomePage() {
		homepage.verifyHomePage();
		homepage.clickOnEditProfile();
		homepage.editHedline();
	}
	
}
