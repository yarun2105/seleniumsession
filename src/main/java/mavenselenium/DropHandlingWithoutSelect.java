package mavenselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropHandlingWithoutSelect {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");

//		List<WebElement> optionList = driver.findElements(By.xpath("//select/option"));
//		System.out.println(optionList.size());
//		
//		for(WebElement e : optionList ) {
//			String text = e.getText();
//			System.out.println(text);
//				if(text.contains("India")) {
//					e.click();
//					break;
//				}
//		}

		By country = By.xpath("//select/option");
		doSelectfromDropDown(country, "India");

	}

	public static List<WebElement> getElements(By locator) { // this is for multiple element
		return driver.findElements(locator);
	}

	public static void doSelectfromDropDown(By locator, String values) {

		List<WebElement> optionList = getElements(locator);
		System.out.println(optionList.size());

		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(values)) {
				e.click();
				break;
			}
		}

	}

}
