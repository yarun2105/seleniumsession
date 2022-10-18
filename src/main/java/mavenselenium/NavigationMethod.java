package mavenselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethod {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().to("https://www.amazon.com");
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		driver.navigate().back();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.navigate().forward();
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		driver.navigate().refresh();
		
		
		

	}

}
