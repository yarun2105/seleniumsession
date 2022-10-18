package mavenselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUPHandle {
	
	
	// to handle authpopup we have to enter username and password along with url
	
	 //username and password is enter along with URL
    // not applicable when username and password is with '@'

	
	static WebDriver driver;

	public static void main(String[] args) {
		
		String username = "admin";
		String password = "admin";
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("httpa://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
		
		
		

	}

}
