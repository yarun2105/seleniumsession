package mavenselenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalNoImagesOnWebPage {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		
//		List<WebElement> ImagesList = driver.findElements(By.tagName("img"));
//		System.out.println("total no of images:" + ImagesList.size() );
//		
//		// src  and alt   attribute
//		
//		
//	for(WebElement e:ImagesList) {
//		String srcValue = e.getAttribute("src");
//		System.out.println(srcValue);
		
	
//		
//		String altvalue = e.getAttribute("alt");
//		System.out.println(altvalue);
//	}
		
		By images = By.tagName("img");
		By links = By.tagName("a");
		
		int totalimages = getElementsCount(images);
		System.out.println(totalimages);
		int totalLinks =getElementsCount(links);
		System.out.println(totalLinks);
		
		ArrayList<String> linksTextList =  getElementsTextList(links);
		System.out.println(linksTextList);
		
		
		//System.out.println("total links:" + getElements(links).size() );
		//System.out.println("total images:" + getElements(images).size() );

	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static ArrayList<String>  getElementsTextList(By locator) {
		List<WebElement> eleList =  getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();
		for(WebElement e:eleList) {
			String Text = e.getText();
			if(Text.length()!=0) {
				eleTextList.add(Text);
			}
			
		}
		return eleTextList;
		
	}

}
