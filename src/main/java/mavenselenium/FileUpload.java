package mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {     // type = 'file'   this is mandatory in html dom then only we wil upload a file 
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		//<type = 'file'>
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Arvind\\Desktop");
		
		
	}

}
