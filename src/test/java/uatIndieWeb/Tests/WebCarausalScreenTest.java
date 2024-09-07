package uatIndieWeb.Tests;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import uatIndieWeb.Base.BaseTest;

public class WebCarausalScreenTest extends BaseTest {
	
	
	
	
	
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
	
	@Test(priority = 4)
	public void letsGetStartedCTATest2() {
		webCarausal.clickOnLetsGetStartedCTA();
	}
	
	
	
	
	
}
	
	


	
	
	
	
	
	
	


