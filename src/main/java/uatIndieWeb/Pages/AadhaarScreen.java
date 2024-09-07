package uatIndieWeb.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AadhaarScreen {
	
	private WebDriver driver;
	public Properties prop;
	
	

	
	//By Locator
	
	     private By inputAdhaarfield1 = By.xpath("(//input[@inputmode=\"numeric\"])[1]");
	     private By inputAdhaarfield2 = By.xpath("(//input[@inputmode=\"numeric\"])[2]");
	     private By inputAdhaarfield3 = By.xpath("(//input[@inputmode=\"numeric\"])[3]");
	     private By inputAdhaarfield4 = By.xpath("(//input[@inputmode=\"numeric\"])[4]");
	     private By inputAdhaarfield5 = By.xpath("(//input[@inputmode=\"numeric\"])[5]");
	     private By inputAdhaarfield6 = By.xpath("(//input[@inputmode=\"numeric\"])[6]");
	     private By inputAdhaarfield7 = By.xpath("(//input[@inputmode=\"numeric\"])[7]");
	     private By inputAdhaarfield8 = By.xpath("(//input[@inputmode=\"numeric\"])[8]");
	     private By inputAdhaarfield9 = By.xpath("(//input[@inputmode=\"numeric\"])[9]");
	     private By inputAdhaarfield10 = By.xpath("(//input[@inputmode=\"numeric\"])[10]");
	     private By inputAdhaarfield11 = By.xpath("(//input[@inputmode=\"numeric\"])[11]");
	     private By inputAdhaarfield12 = By.xpath("(//input[@inputmode=\"numeric\"])[12]");
	     
	     private By inputDOB = By.xpath("//label[text()=\"DOB\"]");
	     private By selectBirthYear = By.className("react-datepicker__year-select");
	     private By selectDOB = By.xpath("//div[@aria-label='Choose Wednesday, August 7th, 1996']");
	     
	     private By checkBoxYes = By.xpath("//div[@data-testid='WEB-AND_ONBRD_ENTR-ADHR_undefined-YES-CHK']");
	     private By submitCTA = By.xpath("//button[@data-testid = \"WEB-AND_ONBRD_ENTR-ADHR_SBMT-BTN\"]");
	     
	     
	     private By inputAdhaarOtpField1 = By.xpath("(//input[@data-testid=\"WEB-AND_ONBRD_ENTR-ADHR_OTP-INPT\"])[1]");
	     private By inputAdhaarOtpField2 = By.xpath("(//input[@data-testid=\"WEB-AND_ONBRD_ENTR-ADHR_OTP-INPT\"])[2]");
	     private By inputAdhaarOtpField3 = By.xpath("(//input[@data-testid=\"WEB-AND_ONBRD_ENTR-ADHR_OTP-INPT\"])[3]");
	     private By inputAdhaarOtpField4 = By.xpath("(//input[@data-testid=\"WEB-AND_ONBRD_ENTR-ADHR_OTP-INPT\"])[4]");
	     private By inputAdhaarOtpField5 = By.xpath("(//input[@data-testid=\"WEB-AND_ONBRD_ENTR-ADHR_OTP-INPT\"])[5]");
	     private By inputAdhaarOtpField6 = By.xpath("(//input[@data-testid=\"WEB-AND_ONBRD_ENTR-ADHR_OTP-INPT\"])[6]");
	     
	     private By adhaarOtpSubmitCTA = By.xpath("//button[text()=\"Submit\"]");
	     
	     private By addressDtlsSubmitCTA = By.xpath("//button[@data-testid='WEB-AND_ONBRD_ADDR-DTLS_SBMT-BTN']");
	     
			
			
			
			
	

	

	
	
	
	public AadhaarScreen(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	
	//Action
	
	
	public void inputAdhaarfield1() {
		driver.findElement(inputAdhaarfield1).sendKeys("6");
	}
	
	public void inputAdhaarfield2() {
		driver.findElement(inputAdhaarfield1).sendKeys("0");
	}
	
	public void inputAdhaarfield3() {
		driver.findElement(inputAdhaarfield1).sendKeys("0");
	}
	
	public void inputAdhaarfield4() {
		driver.findElement(inputAdhaarfield1).sendKeys("0");
	}
	
	public void inputAdhaarfield5() {
		driver.findElement(inputAdhaarfield1).sendKeys("0");
	}
	
	
	public void inputAdhaarfield6() {
		driver.findElement(inputAdhaarfield1).sendKeys("0");
	}
	
	public void inputAdhaarfield7() {
		driver.findElement(inputAdhaarfield1).sendKeys("0");
	}
	
	public void inputAdhaarfield8() {
		driver.findElement(inputAdhaarfield1).sendKeys("0");
	}
	
	public void inputAdhaarfield9() {
		driver.findElement(inputAdhaarfield1).sendKeys("0");
	}
	
	public void inputAdhaarfield10() {
		driver.findElement(inputAdhaarfield1).sendKeys("0");
	}
	
	public void inputAdhaarfield11() {
		driver.findElement(inputAdhaarfield1).sendKeys("1");
	}
	
	public void inputAdhaarfield12() {
		driver.findElement(inputAdhaarfield1).sendKeys("1");
	}
	
	
	
	public void inputDOB() {
		driver.findElement(inputDOB).click();
	}
	
	public void selectBirthYear() {
		WebElement calender = driver.findElement(selectBirthYear);
		Select sel = new Select(calender);
		sel.selectByValue("1996");
	}
	
	
	public void selectDOB() {
		driver.findElement(selectDOB).click();
	}
	
	
	public void checkBoxYes() {
		driver.findElement(checkBoxYes).click();
	}
	
	public void submitCTA() {
		driver.findElement(submitCTA).click();
	}
	
	public void inputAdhaarOtpField1() {
		driver.findElement(inputAdhaarOtpField1).sendKeys("1");
	}
	
	public void inputAdhaarOtpField2() {
		driver.findElement(inputAdhaarOtpField1).sendKeys("2");
	}
	
	public void inputAdhaarOtpField3() {
		driver.findElement(inputAdhaarOtpField1).sendKeys("3");
	}
	
	public void inputAdhaarOtpField4() {
		driver.findElement(inputAdhaarOtpField1).sendKeys("4");
	}
	
	public void inputAdhaarOtpField5() {
		driver.findElement(inputAdhaarOtpField1).sendKeys("5");
	}
	
	public void inputAdhaarOtpField6() {
		driver.findElement(inputAdhaarOtpField1).sendKeys("6");
	}
	
	
	
	public void adhaarOtpSubmitCTA() {
		driver.findElement(adhaarOtpSubmitCTA).click();
	}
	
	
	
	
	
	
	
	public void addressDtlsSubmitCTA() {
		driver.findElement(addressDtlsSubmitCTA).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
