package mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestLoginpage {

	public static void main(String[] args) throws Exception {
		
		
		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.getPageTittle();
		brUtil.getPageUrl();
		
		
		
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		//By emails = By.id("input-email");
		//By password = By.id("input-password");
		//eleUtil.doSendkeys(emails, "arun@yaho.com");
		//eleUtil.doSendkeys(password, "12345466");
		
		By register = By.xpath("//*[@id=\"column-right\"]/div/a[2]");
		eleUtil.doClick(register);
		
		By continueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		eleUtil.doClick(continueBtn);
		
		By wrongmsg = By.className("alert");
		String waringmsg = eleUtil.doGetText(wrongmsg);
		System.out.println(waringmsg);
		
		By FnWring = By.xpath("//*[@id=\"account\"]/div[2]/div/div");
		String warning = eleUtil.doGetText(FnWring);
		System.out.println(warning);
		
		By lnwringmsg = By.xpath("//*[@id=\"account\"]/div[3]/div/div");
		String warning1 = eleUtil.doGetText(lnwringmsg);
		System.out.println(warning1);
		
		
		
//		By firtname = By.id("input-firstname");
//		By lastname = By.id("input-lastname");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By pwdconfirm = By.id("input-confirm");
//		
//		eleUtil.doSendkeys(firtname, "Arun");
//		eleUtil.doSendkeys(lastname, "kumar");
//		eleUtil.doSendkeys(email, "arunk09210@gmail.com");
//		eleUtil.doSendkeys(telephone, "8920825933");
//		eleUtil.doSendkeys(password, "arun@2105");
//		eleUtil.doSendkeys(pwdconfirm, "arun@2105");
//		
		
		
		
		//brUtil.quitBrowser();
		
		
		
		
		

	}

}
