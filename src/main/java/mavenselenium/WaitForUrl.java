package mavenselenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrl {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		By ele = (By.xpath("(//a[@target='_blank']//*[local-name()='svg'])[4]"));
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement youtubeLink = wait1.until(ExpectedConditions.presenceOfElementLocated(ele));
		youtubeLink.click();
		
		// window handle   switch window 
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String ParentWindowId = it.next();
		System.out.println(ParentWindowId);
		
		String childWindowId = it.next();
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		if(wait.until(ExpectedConditions.urlContains("OrangeHRMInc"))) {
			System.out.println(driver.getCurrentUrl());
		}

	}
	
	public static String waitForUrl(int timeOut, String urlFraction) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
			return driver.getCurrentUrl();
		}
		else {
			return null;
			
		}
	}
	
	
	public static String waitForUrlIs(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlToBe(urlValue))) {
			return driver.getCurrentUrl();
		}
		else {
			return null;
			
		}
	}

}
