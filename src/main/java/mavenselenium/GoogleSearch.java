package mavenselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("selenium");

		Thread.sleep(4000);

		// List<WebElement> sugestionList =
		// driver.findElements(By.xpath("//div[@class='ClJ9Yb']/span"));

//		List<WebElement> sugestionList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//		System.out.println(sugestionList.size() - 1);
//
//		for (WebElement e : sugestionList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("selenium interview questions")) {
//				e.click();
//				break;
//
//			}
//
//		}
		
		
		By searchkey = By.name("q");
		
		By suggestion = By.xpath("//div[@class='wM6W7d']/span");
		doSearch(searchkey,"selenium",suggestion,"selenium interview questions");

	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

	public static void doSearch(By searchLocator,  String searchkey , By suggesLocator ,String value) throws InterruptedException {
		
		 getElement(searchLocator).sendKeys(searchkey);
		 
		 Thread.sleep(3000);
		
		
		List<WebElement> suggestionList = getElements(suggesLocator);
		System.out.println(suggestionList.size() - 1);

		for (WebElement e : suggestionList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;

			}

		}

	}
}


