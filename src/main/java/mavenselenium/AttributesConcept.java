package mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributesConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
        
        
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("arun@gmail.com");
		
		String attrval = driver.findElement(By.id("input-email")).getAttribute("value");
		
		System.out.println(attrval);
		
		

	}

}
