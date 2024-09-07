package uatIndieWeb.Base;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import uatIndieWeb.Exception.FrameworkException;
import uatIndieWeb.Pages.AadhaarScreen;
import uatIndieWeb.Pages.MobileScreen;
import uatIndieWeb.Pages.PanScreen;
import uatIndieWeb.Pages.PhoneOtpScreen;
import uatIndieWeb.Pages.WebCarausalScreen;
import uatIndieWeb.factory.DriverFactory;

public class BaseTest {

	DriverFactory df;
	public Properties prop;
	public WebDriver driver;
	public MobileScreen mobileScreen;
	public WebCarausalScreen webCarausal;
	public PhoneOtpScreen phoneOtpScreen;
	public AadhaarScreen  adhaarScreen;
	public PanScreen  panScreen;

	
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		// prop = df.initProp();
		driver = df.initDriver();

		webCarausal = new WebCarausalScreen(driver);
		mobileScreen = new MobileScreen(driver);
		phoneOtpScreen = new PhoneOtpScreen(driver);
		adhaarScreen  = new  AadhaarScreen(driver);
		panScreen  = new PanScreen(driver);

	}

	@AfterTest(enabled = true)
	public void tearDown() {
		driver.quit();
	}

}
