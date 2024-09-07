package uatIndieWeb.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import uatIndieWeb.Base.BaseTest;

public class IndieWebTestcasesWiseExecution extends BaseTest{
	


	
	
	
	@Test(priority = 1)
	public void clickContactCTATest() {
		webCarausal.clickContactCTA();
	}
	
	
	
	
	
	@Test(priority = 2)
	public void getSupportIndieEmailidTest() {
		String actualEmailId = webCarausal.getSupportIndieEmailid();
		Assert.assertEquals(actualEmailId, "indie@indusind.com");
		
	}
	
	@Test(priority = 3)
	public void closeContactUsPopUpTest() {
		webCarausal.clickOkayCTA();
	}
	

	
	@Test(priority = 4)
	public void letsGetStartedCTATest() {
		webCarausal.clickOnLetsGetStartedCTA();
	}
	
	
	
	
	//***********************************Phone number enter screen***************************************************
	
	@Test(priority = 5)
	public void navigationToEnterPhoneNumberScreenTest() {
		String actualText = mobileScreen.isPhoneNumberScreen();
		Assert.assertEquals(actualText, "Enter your phone number");
	}
	
	
	
	@Test(priority = 6)
	public void getTextValidationTest() {
		String ActualText = mobileScreen.getTextvalidation();
		Assert.assertEquals(ActualText, "6 Digit OTP will be sent to this number");
	}

	@Test(priority = 7)
	public void enterPhoneNumberTest() {
		mobileScreen.enterPhoneNumber();

	}
	
	@Test(priority = 8)
	public void clickReferralLinkCTATest() {
		mobileScreen.clickreferralLinkCTA();

	}
	
	@Test(priority = 9)
	public void validateTextAtReferralPopUpTest() {
		String actualText = mobileScreen.validateTextAtReferralPopUp();
		Assert.assertEquals(actualText, "Please enter referral details");

	}
	
	@Test(priority = 10)
	public void enterReferralCodeTest() {
		mobileScreen.enterReferralCode();

	}
	
	@Test(priority = 11)
	public void clickReferralSubmitCTATest() {
		mobileScreen.clickReferralSubmitCTA();

	}
	
	@Test(priority = 12)
	public void getAepsConsentTextTest() {
		String actualtext = mobileScreen.getAepsConsentText();
		Assert.assertEquals(actualtext, "Enable AePS on my IndusInd bank accounts");
	}
	
	@Test(priority = 13)
	public void clickAepsCheckBoxTest() {
		mobileScreen.clickAepsCheckBox();

	}
	
	@Test(priority = 14)
	public void clickPhoneSubmitCTATest() {
		mobileScreen.clickPhoneSubmitCTA();

	}
	
	//******************************************mobile OTP screen************************************************
	
	
	@Test(priority = 15)
	public void getMobileOtpScreenTest() {
		String actualText = phoneOtpScreen.getMobileOTPScreen();
		Assert.assertEquals(actualText, "Enter OTP");
	}
	@Test(priority = 16)
	public void enterOtpTextfield1Test() {
		 phoneOtpScreen.enterOtpTextfield1();
		
	}
	@Test(priority = 17)
	public void enterOtpTextfield2Test() {
		 phoneOtpScreen.enterOtpTextfield2();
		
	}
	
	@Test(priority = 18)
	public void enterOtpTextfield3Test() {
		 phoneOtpScreen.enterOtpTextfield3();
		
	}
	
	@Test(priority = 19)
	public void enterOtpTextfield4Test() {
		 phoneOtpScreen.enterOtpTextfield4();
		
	}
	
	@Test(priority = 20)
	public void enterOtpTextfield5Test() {
		 phoneOtpScreen.enterOtpTextfield5();
		
	}
	
	@Test(priority = 21)
	public void enterOtpTextfield6Test() {
		 phoneOtpScreen.enterOtpTextfield6();
		
	}
	
	@Test(priority = 22)
	public void clickOnOtpSubmitCTATest() {
		phoneOtpScreen.clickOnOtpSubmitCTA();
	}
	

	
	

//*****************************************pan screen*****************************************
	
	@Test(priority = 23)
	public void verifyEnterPanTest() {
		panScreen.enterPan();
	}
	
	@Test(priority = 24)
	public void verifyClickOnPanSubmitCTATest() {
		panScreen.clickOnPanSubmitCTA();
	}
	
	
	
	
	
	//******************************AAdhaar Screen **************************************************
	
	@Test(priority = 25)
	public void verifyInputAdhaarfield1Test() {
		adhaarScreen.inputAdhaarfield1();
	}
	
	@Test(priority = 26)
	public void verifyInputAdhaarfield2Test() {
		adhaarScreen.inputAdhaarfield2();
	}
	
	@Test(priority = 27)
	public void verifyInputAdhaarfield3Test() {
		adhaarScreen.inputAdhaarfield3();
	}
	
	@Test(priority = 28)
	public void verifyInputAdhaarfield4Test() {
		adhaarScreen.inputAdhaarfield4();
	}
	
	@Test(priority = 29)
	public void verifyInputAdhaarfield5Test() {
		adhaarScreen.inputAdhaarfield5();
	}
	
	@Test(priority = 30)
	public void verifyInputAdhaarfield6Test() {
		adhaarScreen.inputAdhaarfield6();
	}
	
	@Test(priority = 31)
	public void verifyInputAdhaarfield7Test() {
		adhaarScreen.inputAdhaarfield7();
	}
	
	@Test(priority = 32)
	public void verifyInputAdhaarfield8Test() {
		adhaarScreen.inputAdhaarfield8();
	}
	
	@Test(priority = 33)
	public void verifyInputAdhaarfield9Test() {
		adhaarScreen.inputAdhaarfield9();
	}
	
	@Test(priority = 34)
	public void verifyInputAdhaarfield10Test() {
		adhaarScreen.inputAdhaarfield10();
	}
	
	@Test(priority = 35)
	public void verifyInputAdhaarfield11Test() {
		adhaarScreen.inputAdhaarfield11();
	}
	

	@Test(priority = 36)
	public void verifyInputAdhaarfield121Test() {
		adhaarScreen.inputAdhaarfield12();
	}
	
	
	@Test(priority = 37)
	public void verifyInputDOBAtAdhaarScreenTest() {
		adhaarScreen.inputDOB();
	}
	
	@Test(priority = 38)
	public void verifySelectBirthYearFromCalenderTest() {
		adhaarScreen.selectBirthYear();
	}
	
	
	
	
	
	
	
}	
	
	
	


