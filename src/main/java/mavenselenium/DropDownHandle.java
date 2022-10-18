package mavenselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		// drop down : Select tag is mandatory
		//tag name .....  select
		// select class in Selenium
		//  sendkeys methos is also used for dropdown  but only for when Select html tag .
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		//country.sendKeys("India");
	
		Select sel = new Select(country);
		
		List<WebElement> countryOptions =  sel.getOptions();
		System.out.println(countryOptions.size()-1);
		
		for(WebElement e:countryOptions) {
			String text  = e.getText();
			System.out.println(text);
		}
		
		// assigment to create this as generic method
			
			
		
		
		// sel.selectByIndex(5);     //  for static drop down list  example  month week name etc
		// sel.selectByVisibleText("India");  //   mostly we used this 
		//sel.selectByValue("Afghanistan");  //   sometime devloper not provide values 
		
//		By country = By.id("Form_getForm_Country");
//		
//		doSelectDropDownByIndex(country,5);
//		doSelectDropDownByIndex(country,6);
//		
//		doSelectDropDownByVisibleText(country,"India");
//		
		
		
		
		
		

	}
	
	// requirement ...  when we have 10 dropdwon 
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static List<WebElement> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static int getDropDownOptionsCount(By locator) {
		return getDropDownOptions(locator).size();
	}
		
		
	
		
		
		
		
	
	

}
