package uatIndieWeb.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PanScreen {
	private WebDriver driver;
	public Properties prop;



	//Locator
	
	private By panInput = By.name("input");
	private By panSubmitCTA = By.xpath("//button[@data-testid = \"WEB-AND_ONBRD_ENTR-PAN_SBMT-BTN\"]");
	
	
	
	
	
	
	
	
	
	
	
	public PanScreen(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	//page Action
	
	public void enterPan() {
		driver.findElement(panInput).sendKeys("XXXPX9864T");
	}
	
	
	
	public AadhaarScreen clickOnPanSubmitCTA() {
		driver.findElement(panSubmitCTA).click();
		
		return   new AadhaarScreen(driver);
	}
	
	
	
	
	
	
	
	
	


	
}
