package mavenselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();   // this is WebDrivermanager dependency first we have to add in pom.xml file 
		                                           // no need to write system.setproperty  and also no need to download driver.exe file
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String tittle = driver.getTitle();
		
		System.out.println(tittle);
		
		
		//  validation for testing    actual vs expected
		
		if(tittle.equals("Google")) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		
	   String source = driver.getPageSource();
	   
	   System.out.println(source);
	   
	   if(source.contains("Copyright The Closure Library Authors")) {
		   System.out.println("right source");
	   }
	   else {
		   System.out.println("wrong source");
	   }
	
	
			
		
		

	}

}
