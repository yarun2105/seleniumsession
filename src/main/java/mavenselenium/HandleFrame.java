package mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		// two type of frames 
		// 1. frame  depricated
		//2 iframe 
		
		//this is overloading method in selenium already defined
		
		// frame is generally provide by the developer to secure the webelement  confidentially information 
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
	
		
		
		driver.switchTo().defaultContent();    // back to the main page 
		
		
		
		
		

	}

}
