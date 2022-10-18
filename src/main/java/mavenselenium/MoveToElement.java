package mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {          // MouseHover
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.get("https://www.spicejet.com/");
		
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"))).build().perform();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
		
		//By parentMenu = By.xpath("//a[text()='Laptops & Notebooks']");
		//By childMenu = By.xpath("//a[contains(text(),'Windows')]");
		
		By parentMenu = By.xpath("//div[text()='Add-ons']");
		By childMenu = By.xpath("//div[text()='SpiceMAX']");
		
		
		moveToElementLevel1(parentMenu,childMenu);
		

	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void moveToElementLevel1(By parentLocator,By Childlocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentLocator)).build().perform();
		Thread.sleep(3000);
		//getElement(Childlocator).click();
		doClick(Childlocator);
	}
	
	public static void moveToElementLevel2(By parent1Locator, By parent2Locator, By Childlocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent1Locator)).build().perform();
		Thread.sleep(3000);
		act.moveToElement(getElement(parent2Locator)).build().perform();
		Thread.sleep(3000);
		//getElement(Childlocator).click();
		doClick(Childlocator);
	}

}
