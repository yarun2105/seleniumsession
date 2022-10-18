package mavenselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) {
		
		//  MultipleElements ---  findElements........return type is  list<WebElement>  
		// single element  ----- FindElement .......return type is WebElement
		//  total no. of links/ images/ buttons/
		// but do not print the blank value
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("Total links:"  + linklist.size() );
		
//		
//		for(int i = 0; i<linklist.size(); i++) {
//			String text = linklist.get(i).getText();
//				if(text.length()!=0) {
//					System.out.println(text);
//				}
		//}
		
		for(WebElement e :linklist) {
			String text =  e.getText();
				if(text.length()!=0) {
					System.out.println(text);
				}
				
				String hrefvalue = e.getAttribute("href");
				System.out.println(hrefvalue);
			
		}
		
				
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
