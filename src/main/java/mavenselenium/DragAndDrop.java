package mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop { // element to element drag and drop

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		By sourceEle = By.id("draggable");
		By targetEle = By.id("droppable");
		
		dragAndDrop(sourceEle,targetEle);
		
		//Actions act = new Actions(driver);
		
		// 1 approach
		//act.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();   //builder pattern
		
		//2 approach
		//act.dragAndDrop(sourceEle, targetEle).build().perform();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void dragAndDrop(By draggableLocator, By droppableLocator) {
		WebElement sourceEle = getElement(draggableLocator);
		WebElement targetEle = getElement(droppableLocator);
		
		Actions act = new Actions(driver);
		
		//act.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();   //builder pattern
		
		act.dragAndDrop(sourceEle, targetEle).build().perform();
	}

}
