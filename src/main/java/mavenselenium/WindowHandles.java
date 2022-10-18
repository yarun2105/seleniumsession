package mavenselenium;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().setSize(new Dimension(500,400));
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it  = handles.iterator();
		
		String parentWindowId  = it.next();
		System.out.println("Parent Window id is :" + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child Window id is :" + childWindowId);
		
		driver.switchTo().window(childWindowId);
		driver.findElement(By.name("first_name")).sendKeys("akshay kumar");
		
		driver.switchTo().window(parentWindowId);
		
		boolean loginbtn = driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed();
		System.out.println(loginbtn);
		
		
		


	}

}
