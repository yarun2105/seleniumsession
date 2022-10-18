package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import mavenselenium.BrowserUtil;

public class BaseTest {
WebDriver driver;


	@Parameters({"url","browser"})
	@BeforeTest
	public void setUp(String url, String browser) {
		
		BrowserUtil br = new BrowserUtil();     //BrowserUtil
		driver =  br.launchBrowser(browser);
		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
