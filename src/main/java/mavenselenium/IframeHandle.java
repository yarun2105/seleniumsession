package mavenselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.londonfreelance.org/courses/frames/index.html");
	
	
	
	}

}
