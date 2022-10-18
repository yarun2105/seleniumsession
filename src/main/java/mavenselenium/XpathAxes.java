package mavenselenium;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://classic.crmpro.com/index.html");

		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(4000);

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.xpath("//a[@title = 'Contacts']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Romi singh']"));
		
		// RelativeLocator    by using with() method # import static with method first
		
		driver.findElement(with(By.tagName("input")).toLeftOf(ele)).click();     

		//String xpath = "//a[text()='Romi singh']/parent::td/preceding-sibling::td/input[@type='checkbox']";

		//driver.findElement(By.xpath(xpath)).click();

		 //selectContact("Ali khan");

//		List<WebElement> contactDetails = driver
//				.findElements(By.xpath("//a[text()= 'Ali khan' ]/parent::td/following-sibling::td"));
//
//		for (WebElement e : contactDetails) {
//			String text = e.getText();
//			System.out.println(text);
//		}
//		
		
		// getUserInfo("Romi singh");
		
		
		
		
		

	}

	public static void getUserInfo(String username) {
		List<WebElement> contactDetails = driver
				.findElements(By.xpath("//a[text()= '"+username+"' ]/parent::td/following-sibling::td"));

		for (WebElement e : contactDetails) {
			String text = e.getText();
			System.out.println(text);
		}
	}

	public static void selectContact(String username) {
		String xpath = "//a[text()='" + username + "']/parent::td/preceding-sibling::td/input[@type='checkbox']";

		driver.findElement(By.xpath(xpath)).click();
		
	

	}

}
