package mavenselenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesWithWhileLoop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();  //link
		driver.findElement(By.xpath("(//*[local-name()='svg'])[2]")).click();  //fb
		driver.findElement(By.xpath("(//*[local-name()='svg'])[3]")).click();  //twt
		driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).click();  //yt
		
		
		Set<String> handles =  driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			String title = driver.getTitle();
			System.out.println(title);
				if(!windowId.equals(parentWindowId))
					driver.close();
			
		}
		
		driver.switchTo().window(parentWindowId);
		String ParentWindowTitle  =  driver.getTitle();
		System.out.println(ParentWindowTitle);

	}

}
