package mavenselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAssignment {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//driver.findElement(By.name("q")).sendKeys("selenium");

		
		
		 driver.findElement(By.id("search_query_top")).sendKeys("dress");
		 Thread.sleep(4000);
		 
		By printDress=(By.xpath("//li[text()='Evening Dresses > Printed ']"));
		doSearch("li","text");
//		 
//		List<WebElement> suggesList = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
//		
//		for(WebElement e : suggesList){
//			String text = e.getText();
//			System.out.println(text);
//				if(text.equals("Casual Dresses > Printed Dress")) {
//					e.click();
//					break;
//				}

		}
	
	
	public static void doSearch(String tagName, String text) {
		By suggLocator =(By.xpath("//"+tagName+"[text()='"+text+" ']"));
		driver.findElement(suggLocator).click();
	}
		

	}






