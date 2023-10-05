package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,  this);
	}

	@FindBy(xpath= "//span[text()='Media']")
	WebElement media;

	@FindBy(xpath= "//span[text()='Job']")
	WebElement job;
	@FindBy(xpath= "//div[text()='Abel Joy']")
	WebElement profileName;
	
	@FindBy(xpath = "//button[@aria-label='Edit intro']")
	WebElement editProfile;
	
	@FindBy(xpath="//label[text()='Headline']")
	WebElement headline;
	
	@FindBy(xpath="//label[text()='Headline']/following-sibling::input")
	WebElement editHeadline;
	
	public void verifyHomePage() {
		Assert.assertTrue(media.isDisplayed(), "Media is not displayed");
		Assert.assertTrue(job.isDisplayed(), "Job is not displayed");
		Assert.assertTrue(profileName.isDisplayed(), "Profilename is not displayed");

	}
	
	public void clickOnEditProfile() {
		editProfile.click();
	}
	
	public void editHedline() {
		Assert.assertTrue(headline.isDisplayed(), "Headline is not displayed");
		 String replaceEle= editHeadline.getAttribute("Value");
		 replaceEle.replace(" QA Automation Tester", " QA Automation Engineer");
		 editHeadline.sendKeys(replaceEle);
	}

	
}
