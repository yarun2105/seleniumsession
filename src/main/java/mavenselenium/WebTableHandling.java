package mavenselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/51264/sl-vs-pak-final-asia-cup-2022");

		List<WebElement> playerInfo = driver
				.findElements(By.xpath("//a[text()=' B Rajapaksa ']/parent::div/following-sibling::div"));
		
		
		for(WebElement e : playerInfo) {
			String text = e.getText();
			System.out.println(text);
			
		}
	}

}
