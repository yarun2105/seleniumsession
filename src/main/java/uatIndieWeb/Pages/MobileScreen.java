package uatIndieWeb.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobileScreen {

	private WebDriver driver;
	public Properties prop;

	// By Locator

	private By text = By.xpath("//div[text()='6 Digit OTP will be sent to this number']");
	private By inputPhoneNumber = By.name("input");
	private By referrallink = By.xpath("//div[text()='Do you have any referral?']");
	private By referralPopUp = By.xpath("//h3[text()='Please enter referral details']");
	private By inputReferralCode = By.name("referalCode");
	private By submitReferralCTA = By.xpath("//button[text()='Continue']");
	private By aepsConsentText = By.xpath("//div[text()='Enable AePS on my IndusInd bank accounts']");
	private By aepsConsentCheckBox = By.xpath("//div[@data-testid='WEB-AND_ONBRD_MOB-NUM_undefined-YES-CHK']");
	private By phoneSubmitCTA = By.xpath("//button[text()='Submit']");
	private By enterPhoneScreen = By.xpath("//div[text()='Enter your phone number']");

	// constructor
	public MobileScreen(WebDriver driver) {
		this.driver = driver;
	}
	// page action

	public String getTextvalidation() {
		String text1 = driver.findElement(text).getText();
		System.out.println(text1);
		return text1;
	}

	public void enterPhoneNumber() {
		driver.findElement(inputPhoneNumber).sendKeys("9811121300");
	}

	public void clickreferralLinkCTA() {
		driver.findElement(referrallink).click();

	}

	public String validateTextAtReferralPopUp() {
		String referralText = driver.findElement(referralPopUp).getText();
		System.out.println(referralText);
		return referralText;
	}

	public void enterReferralCode() {
		driver.findElement(inputReferralCode).sendKeys("ibl138344");
	}

	public void clickReferralSubmitCTA() {
		driver.findElement(submitReferralCTA).click();
	}

	public String getAepsConsentText() {
		String aepsText = driver.findElement(aepsConsentText).getText();
		System.out.println(aepsText);
		return aepsText;
	}

	public void clickAepsCheckBox() {
		driver.findElement(aepsConsentCheckBox).click();
	}

	public PhoneOtpScreen clickPhoneSubmitCTA() {
		driver.findElement(phoneSubmitCTA).click();
		return new PhoneOtpScreen(driver);
	}

	

	public String isPhoneNumberScreen() {

		String text = driver.findElement(enterPhoneScreen).getText();
		System.out.println(text);
		return text;
	}

}
