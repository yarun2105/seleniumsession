package mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");

		// right , left, below , above by using with()

		WebElement ele = driver.findElement(By.linkText("Whistler, Canada"));
//
//		// right of the base element
//		
//
//		String rightAQIIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText(); 
//		System.out.println(rightAQIIndex);
//		
//
//		// left of the base elemnt
//		
//
//		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();    
//		System.out.println(leftRank);
//
//		// Below of the base element
//		
//
//		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
//		System.out.println(belowCity);
//
//		// above of the base element
//		
//
//		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
//		System.out.println(aboveCity);
		
		
		// near element
		
		String nearEle =  driver.findElement(with(By.tagName("p")).near(ele)).getAttribute("class");
		System.out.println(nearEle);
		

		By CityName = By.linkText("Whistler, Canada");

		getCityWiseDetails(CityName, "Whistler, Canada", "p");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void getCityWiseDetails(By CityLocator, String cityName, String tagname) {
		WebElement ele = getElement(CityLocator);

		String rightAQIIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightAQIIndex);
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);

	}
	
	
}
