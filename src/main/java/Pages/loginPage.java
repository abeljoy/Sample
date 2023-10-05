package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPage {
	WebDriver driver;
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver,  this);
	}
	@FindBy(xpath =  "//input[@name='session_key']")
	WebElement userName;
	@FindBy(xpath =  "//input[@name='session_password']")
	WebElement password;
	
	@FindBy(xpath = "//h1[contains(text(),'jobs through')]")
	WebElement title;
	@FindBy (xpath= "//label[contains(text(),'Email')]")
	WebElement  emailText;
	@FindBy (xpath= "//label[contains(text(),'Password')]")
	WebElement  pwdText;
	@FindBy (xpath ="//button[contains(text(),'Sign in')]")
	WebElement  signInbtn;
	public void verifyLoginPageDisplayed() {
		Assert.assertTrue(title.isDisplayed(), "Title is not displayed");
		Assert.assertTrue(emailText.isDisplayed(), "Email is not displayed");
		Assert.assertTrue(pwdText.isDisplayed(), "pwdText is not displayed");
		Assert.assertTrue(signInbtn.isDisplayed(), "Sign in button is not displayed");
	}
	
	public void login() {
		userName.clear();
		userName.sendKeys("abeljoydasan@gmail.com");
		password.clear();
		password.sendKeys("Adib@12328");
		signInbtn.click();
	}
	
	

}
