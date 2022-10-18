package mavenselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessIncognitoConcept {

	public static void main(String[] args) {
		
		//headless --- no browser
		//testing in the background
		//faster than the normal node
		
		ChromeOptions co = new ChromeOptions();
		//co.setHeadless(true);
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.quit();
		

	}

}
