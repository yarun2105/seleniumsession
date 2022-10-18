package mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElement { // SVG scalar vector graph or diagram element

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("mobile phone");   // search text box

		// button[@class='L0Z3Pu']//*[local-name() = 'svg'] SVG element xpath

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']//*[local-name() = 'svg']")).click();  //svg elemnet 

	}

}
