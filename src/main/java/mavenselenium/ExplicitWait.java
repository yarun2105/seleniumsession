package mavenselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	static WebDriver driver;

	public static void main(String[] args) {

		// ExplicitWait
		// 1. WebDriverWait
		// 2. FluentWait

		// Explicit wait is applied for a specific element
		// it is not a global wait
		// it is also used for nonwebelement also like tittle , url, alerts.

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email = By.id("input-email");
		By pass = By.id("input-password");
		By logo = By.cssSelector("img.img-responsive");

//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		ele.sendKeys("arun@GMAIL.COM");
//		
//		driver.findElement(pass).sendKeys("123");
//		
////		boolean flag = driver.findElement(logo).isDisplayed();
////		System.out.println(flag);
////
//		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
//		WebElement logoP = wait1.until(ExpectedConditions.presenceOfElementLocated(logo));
//		boolean flag = logoP.isDisplayed();
//		System.out.println(flag);

		WebElement ele = waitForElementPresence(email, 10);
		ele.sendKeys("test@gmail.com");

		WebElement pass1 = getElement(pass);
		pass1.sendKeys("1234566");

		WebElement logo1 = getElement(logo);
		boolean flag = logo1.isDisplayed();
		System.out.println(flag);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	// An expectation for checking that an element is present on the DOM of a page.
	// This does notnecessarily mean that the element is visible.
	// Parameters:locator used to find the elementReturns:the WebElement once it is
	// located

	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	// An expectation for checking that an element is present on the DOM of a page
	// and visible.Visibility means that the element
	// is not only displayed but also has a height and width that is greater than 0.

	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
