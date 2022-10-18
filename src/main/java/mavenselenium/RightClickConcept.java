package mavenselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		
		// RIGHT CLICK OR CONTEXT CLICK     BOTH ARE SAME
		
		// for right click element we use ContextClick().
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
//		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//		Actions act = new Actions(driver);
//		act.contextClick(rightClick).build().perform();
//		List<WebElement> text = driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]/li/span"));
//		System.out.println(text.size());
//		
//		for(WebElement e :text) {
//			String text1 = e.getText();
//			System.out.println(text1);
//				if(text1.equals("Copy")) {
//					e.click();
//					break;
//				}
//		}
		
		By rightClick = By.xpath("//span[text()='right click me']");
		By optionList =By.xpath("//ul[contains(@class,'context-menu-list')]/li/span");
		
		doRightClick(rightClick,optionList);

	}
	
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doRightClick(By rightclicklocator,By optionslocator) {
		WebElement rightClick = getElement(rightclicklocator);
		Actions act = new Actions(driver);
		act.contextClick(rightClick).build().perform();
		List<WebElement> optionsList = getElements(optionslocator);
		System.out.println(optionsList.size());
		
		for(WebElement e :optionsList) {
			String text1 = e.getText();
			System.out.println(text1);
				if(text1.equals("Copy")) {
					e.click();
					
					break;
				}
		}
		
	}

}
