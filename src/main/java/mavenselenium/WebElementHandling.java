package mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[2]")).click();   // register
		
		// create a webelement   # then perform action(click   sendkeys   select   isdisplayed  gettext)
		
		// 1 approach
		
//		driver.findElement(By.id("input-email")).sendKeys("arun@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("arun123");
//		
		//2 approach
		
//		WebElement emails = driver.findElement(By.id("input-email"));       //  here we create interface reference emails
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emails.sendKeys("arun@gmail.com");
//		password.sendKeys("arun123");
//		
		// 3 approach   By Locator:  OR   object repository
		
//		By emails = By.id("input-email");
//		
//		By password = By.id("input-password");
//		
//		WebElement emailId = driver.findElement(emails);
//		WebElement pwd = driver.findElement(password);
//		
//		emailId.sendKeys("arun@gmail.com");
//		pwd.sendKeys("arun123");
//		
		
		
		//  4 approach   By locator with generic function
		
//		By emails = By.id("input-email");
//		By password = By.id("input-password");
//		getElement(emails).sendKeys("arun@123");
//		getElement(password).sendKeys("arun123");
//		
		
		// 5 approach  By locator  # getelement # action
		
//		By emails = By.id("input-email");
//		By password = By.id("input-password");
//		doSendkeys(emails, "test@gmail.com");
//		doSendkeys(password, "test123");
//		
		
		//6 approach   By locator # ElementUtil.........generic function
//		
//		By emails = By.id("input-email");
//		By password = By.id("input-password");
//		
//		ElementUtil Eleutil = new ElementUtil(driver);
//		Eleutil.doSendkeys(emails, "teat@gmail.com");
//		Eleutil.doSendkeys(password, "test123");
		
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
//		
		
		By header = By.tagName("h1");
		By recurringaccount = By.linkText("Recurring payments");
		By fnamelebel = By.linkText("First Name");
		String firstname = doGetText(fnamelebel);
		System.out.println(firstname);
		
		String recuring = doGetText(recurringaccount);
		System.out.println(recuring);
		
		String actualHeader = doGetText(header);
		if(actualHeader.equals("Register Account")) {
			System.out.println("correct header");
		}
		else {
			System.out.println("incorrect header");
		}
	
		
	}
	
//	public static void doSendkeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//	}
//	
	public  static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	
	
	

}
