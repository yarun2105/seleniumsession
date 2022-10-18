package mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestFacebook {
	
	public static void main(String []args) throws Exception {
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://www.facebook.com");
		//brUtil.getPageTittle();
		
		
		
		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		
//		By username = By.id("email");
//		By password = By.id("pass");
//		By Loginbtn = By.name("login");
//		
//		eleUtil.doSendkeys(username, "arunk8697@gmail.com");
//		eleUtil.doSendkeys(password, "Yarun@_*2105");
//		eleUtil.doClick(Loginbtn);
//		
//		//brUtil.quitBrowser();
//	}

}
}
