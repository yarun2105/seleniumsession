package mavenselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPopUp {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		// java script popup  is not a part of webpage ;
		//alert popup
		// three types of alert
		//1 . alert()
		//2 confirm()
		//3.  prompt()
		
		
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		
		
		Alert alert= driver.switchTo().alert();
		
		String text = alert.getText(); 
		System.out.println(text);
		
		//alert.accept();
		alert.dismiss();
		
		

	}
	
	public static Alert popUpAlerts() {
		return driver.switchTo().alert();
	}
	
	public static String getAlertsMessage() {
		return popUpAlerts().getText();
	}
	
	public static void acceptAlert() {
		popUpAlerts().accept();
	}
	
	public static void dismissAlert() {
		popUpAlerts().dismiss();
	}
	
	public static void alertSendKeys(String value) {
		popUpAlerts().sendKeys(value);
	}

}
