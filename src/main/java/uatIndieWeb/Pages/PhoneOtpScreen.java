package uatIndieWeb.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhoneOtpScreen {
	
	private WebDriver driver;
	public Properties prop ;

      // By Locator

	private By enterOTPScreen = By.xpath("//div[text()='Enter OTP']");
	private By otpText1 =By.xpath("(//input[@inputmode=\"numeric\"])[1]");
	private By otpText2 =By.xpath("(//input[@inputmode=\"numeric\"])[2]");
	private By otpText3 =By.xpath("(//input[@inputmode=\"numeric\"])[3]");
	private By otpText4 =By.xpath("(//input[@inputmode=\"numeric\"])[4]");
	private By otpText5 =By.xpath("(//input[@inputmode=\"numeric\"])[5]");
	private By otpText6 =By.xpath("(//input[@inputmode=\"numeric\"])[6]");
	private By otpSubmitCTA = By.xpath("//button[@data-testid = \"WEB-AND_ONBRD_MOB-OTP_SBMT-BTN\"]");

	
	
	
	
	
	public PhoneOtpScreen(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	
	
	//Page Action
	public String getMobileOTPScreen() {
		String text = driver.findElement(enterOTPScreen).getText();
		System.out.println(text);

		return text;
	}
	
	public void enterOtpTextfield1() {
		driver.findElement(otpText1).sendKeys("1");
	}
	
	public void enterOtpTextfield2() {
		driver.findElement(otpText2).sendKeys("2");
	}
	
	public void enterOtpTextfield3() {
		driver.findElement(otpText3).sendKeys("3");
	}
	
	public void enterOtpTextfield4() {
		driver.findElement(otpText4).sendKeys("4");
	}
	
	public void enterOtpTextfield5() {
		driver.findElement(otpText5).sendKeys("5");
	}
	
	public void enterOtpTextfield6() {
		driver.findElement(otpText6).sendKeys("6");
	}
	
	public PanScreen clickOnOtpSubmitCTA() {
		driver.findElement(otpSubmitCTA).click();
		return new PanScreen(driver);
	}
	
	

	

}
