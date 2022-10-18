package mavenselenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitle {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		if(wait.until(ExpectedConditions.titleContains(" Modern and Easy Customer"))) {
			System.out.println(driver.getTitle());
		}
		
		if(wait.until(ExpectedConditions.titleIs("Freshworks | Modern and Easy Customer and Employee Experience Software"))){
			System.out.println(driver.getTitle());
		}
			
			
				
		

	}
	
	public static String waitForTitleContains(int timeOut, String titleFraction) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		else {
			return null;
		}
	}
	
	public static String waitFortitleIs(int timeOut, String tilteValue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleIs(tilteValue))) {
			return driver.getTitle();
		}
		else {
			return null;
		}
	}

}
