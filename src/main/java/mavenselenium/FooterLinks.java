package mavenselenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.get("https://www.amazon.com");
		
//		List<WebElement> footerList = driver.findElements(By.xpath("//footer//a"));
//		System.out.println(footerList.size());
//		
//		for(WebElement e :footerList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		
		By footers= By.xpath("//div[@class='navLeftFooter nav-sprite-v1']//a");
		ArrayList<String> actualFoterList = getFooterlinkList(footers);
		
		if(actualFoterList.contains("Blog")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	
		

	}
	
	
	public static ArrayList<String>  getFooterlinkList(By locator) {
		List<WebElement> footerList = driver.findElements(locator);
		System.out.println(footerList.size());
		
		ArrayList<String> eleList = new ArrayList<String>();
		
		for(WebElement e :footerList) {
			String text = e.getText();
			eleList.add(text);
			
			System.out.println(eleList);
		}
		
		return eleList;
	}
	
	
	public static boolean isSingleElementPresent(By locator) {
		List<WebElement> List = driver.findElements(locator);
		System.out.println(List.size());
		
		if(List.size()==1) {
			System.out.println("single search ele is present on the page");
			return true;
		}
		else {
			System.out.println("no search or multiple search element is present");
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
