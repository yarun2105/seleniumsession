package mavenselenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsScrolling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();   //selenium 4.x  
		
		act.sendKeys(Keys.PAGE_UP).build().perform();
		
		
		
		

	}

}
