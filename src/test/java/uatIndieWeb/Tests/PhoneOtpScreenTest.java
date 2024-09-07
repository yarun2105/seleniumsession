package uatIndieWeb.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import uatIndieWeb.Base.BaseTest;

public class PhoneOtpScreenTest extends BaseTest{
	
	
	
	@BeforeClass
	public void phoneOTPScreenSetUp() {
		webCarausal.clickOnLetsGetStartedCTA();
	}
	
	

	
	
	
	
	
	@Test(priority = 1)
	public void getMobileOtpScreenTest() {
		String actualText = phoneOtpScreen.getMobileOTPScreen();
		Assert.assertEquals(actualText, "Enter OTP");
	}
	
	@Test(priority = 2)
	public void enterOtpTextfield1Test() {
		 phoneOtpScreen.enterOtpTextfield1();
		
	}
	
	@Test(priority = 3)
	public void enterOtpTextfield2Test() {
		 phoneOtpScreen.enterOtpTextfield2();
		
	}
	
	@Test(priority = 4)
	public void enterOtpTextfield3Test() {
		 phoneOtpScreen.enterOtpTextfield3();
		
	}
	
	@Test(priority = 5)
	public void enterOtpTextfield4Test() {
		 phoneOtpScreen.enterOtpTextfield4();
		
	}
	
	@Test(priority = 6)
	public void enterOtpTextfield5Test() {
		 phoneOtpScreen.enterOtpTextfield5();
		
	}
	
	@Test(priority = 7)
	public void enterOtpTextfield6Test() {
		 phoneOtpScreen.enterOtpTextfield6();
		
	}
	
	@Test(priority = 8)
	public void clickOnOtpSubmitCTATest() {
		phoneOtpScreen.clickOnOtpSubmitCTA();
	}
	
}