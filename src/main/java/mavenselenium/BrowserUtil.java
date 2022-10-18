package mavenselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	
	private WebDriver driver;
	/**
	 * 
	 * @param browser          // this method is used to initialize the driver on the basis of browser name.
	 */
	
	
	
	
	
	public WebDriver launchBrowser(String browser) {
		System.out.println("browser name is:" + browser);
		
		switch (browser.toLowerCase()) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		
		
		default:
			System.out.println("plz provide the right browser....");
			
			break;
		}
		
		return driver;
	}
	
	
	


	public void launchUrl(String url) throws Exception {
		
		if(url == null) {
			System.out.println("url is null");
			throw new Exception("URLNULLEXCEPTION");
		}
		
		
		if(url.length()==0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}
		
		
		
		if(url.indexOf("http")!=0 || url.indexOf("https")!=0) {
			System.out.println("http(s) is missing in url");
			throw new Exception("http(S)MISSINGEXCEPTION");
		}
		
		
		driver.get(url);
	}
	
	public String getPageTittle() {
		String title = driver.getTitle();
		System.out.println("page tittle is:" + title);
		if(title != null) {
			return title;
		}
		else {
			System.out.println("getting null title");
			
			return null;
			
		}
		
	}
	
	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("current url is:" + url);
		if(url!= null) {
			return url;
		}
		else {
			System.out.println("getting null url");
			return null;
			
		}
	}
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
			System.out.println("browser is close");
		}
	}
	
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
			System.out.println("browser is quit");
		}
	}
}
