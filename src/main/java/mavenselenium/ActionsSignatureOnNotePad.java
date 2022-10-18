package mavenselenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSignatureOnNotePad {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://signature-generator.com/draw-signature/");
		
		WebElement canvas = driver.findElement(By.id("signature-pad"));
		
		Actions act = new Actions(driver);
		
		act.click(canvas).moveToElement(canvas, 5, 5)
					.clickAndHold(canvas)
					.moveByOffset(100, -50)
					.moveByOffset(150, 50)
					.moveByOffset(50, -60)
					.release(canvas)
					.build()
		.perform();
		
		
		

	}

}
