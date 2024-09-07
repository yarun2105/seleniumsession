package uatIndieWeb.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebCarausalScreen {
	
	private WebDriver driver;
	
	
	
	
	//By locator
	
    
    private By contactUs = By.xpath("//span[text()='Contact Us']");
    private By supportIndieEmailid = By.xpath("//a[text()='indie@indusind.com']");
    private By okayCTA = By.xpath("//button[@data-testid='TRY-AGAIN-SBMT-BTN']");
    private By letsGetstarted = By.xpath("//button[@data-testid = \"WEB-AND_ONBRD_HOM-SCR_SBMT-BTN\"]");
   
    
    
	
	
	
	
	// page constructor
	
	public WebCarausalScreen(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	
	//page actions
	
	
	public void clickContactCTA() {
		driver.findElement(contactUs).click();
	}
	
	
	
	public String getSupportIndieEmailid() {
		String emailid = driver.findElement(supportIndieEmailid).getText();
		System.out.println("Indie Support Email id is : " + emailid);
		return emailid;
	}
	
	public void clickOkayCTA() {
		driver.findElement(okayCTA).click();
	}
	
	public MobileScreen clickOnLetsGetStartedCTA() {
		driver.findElement(letsGetstarted).click();
		
		return new MobileScreen(driver);
	}
	
	
		

	
	
	
	
			
			
			
			
		
	

	
}
