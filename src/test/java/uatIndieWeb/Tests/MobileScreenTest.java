package uatIndieWeb.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import uatIndieWeb.Base.BaseTest;

public class MobileScreenTest extends BaseTest {
	
	
	
	@BeforeClass
	public void mobileScreenSetUp() {
		mobileScreen.clickPhoneSubmitCTA();
	}

	@Test(priority = 1)
	public void navigationToEnterPhoneNumberScreenTest() {
		String actualText = mobileScreen.isPhoneNumberScreen();
		Assert.assertEquals(actualText, "Enter your phone number");
	}
	
	
	
	@Test(priority = 2)
	public void getTextValidationTest() {
		String ActualText = mobileScreen.getTextvalidation();
		Assert.assertEquals(ActualText, "6 Digit OTP will be sent to this number");
	}

	@Test(priority = 3)
	public void enterPhoneNumberTest() {
		mobileScreen.enterPhoneNumber();

	}
	
	@Test(priority = 4)
	public void clickReferralLinkCTATest() {
		mobileScreen.clickreferralLinkCTA();

	}
	
	@Test(priority = 5)
	public void validateTextAtReferralPopUpTest() {
		String actualText = mobileScreen.validateTextAtReferralPopUp();
		Assert.assertEquals(actualText, "Please enter referral details");

	}
	
	@Test(priority = 6)
	public void enterReferralCodeTest() {
		mobileScreen.enterReferralCode();

	}
	
	@Test(priority = 7)
	public void clickReferralSubmitCTATest() {
		mobileScreen.clickReferralSubmitCTA();

	}
	
	@Test(priority = 8)
	public void getAepsConsentTextTest() {
		String actualtext = mobileScreen.getAepsConsentText();
		Assert.assertEquals(actualtext, "Enable AePS on my IndusInd bank accounts");
	}
	
	@Test(priority = 9)
	public void clickAepsCheckBoxTest() {
		mobileScreen.clickAepsCheckBox();

	}
	
	@Test(priority = 10)
	public void clickPhoneSubmitCTATest() {
		mobileScreen.clickPhoneSubmitCTA();

	}
	
	
}
