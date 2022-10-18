package mavenselenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxesPractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(4000);

		// driver.findElement(By.xpath("//a[text()= 'PracticePage']"));

		// a[text() =
		// 'Joe.Root']/parent::td/preceding-sibling::td/input[@id='ohrmList_chkSelectRecord_21']

		// String xpath = "//a[text()=
		// 'Joe.Root']/parent::td/preceding-sibling::td/input[@name ='chkSelectRow[]']";
//
//		String xpath = "//a[text() = 'Joe.Root']/parent::td/preceding-sibling::td/input[@id='ohrmList_chkSelectRecord_21']";
//
//		driver.findElement(By.xpath(xpath)).click();
//
//		String xpath1 = "//a[text() = 'Joe.Root']/parent::td/following-sibling::td";
//
//		List<WebElement> detailsOfUser = driver.findElements(By.xpath(xpath1));
//		
//		for(WebElement e :detailsOfUser ) {
//			String text =  e.getText();
//			System.out.println(text);
//			
//		}

		// a[text()='Kevin.Mathews']/parent::td/preceding-sibling::td/input[starts-with(@id,ohrmList)]

		selectUser("Kevin.Mathews");
		userInfo("Kevin.Mathews");

	}

	public static void selectUser(String username) {
		String xpath = "//a[text()='" + username
				+ "']/parent::td/preceding-sibling::td/input[starts-with(@id,ohrmList)]";

		driver.findElement(By.xpath(xpath)).click();

	}

//	public static ArrayList<String> userInfo(String username) {
//		String xpath1 = "//a[text() = '" + username + "']/parent::td/following-sibling::td";
//
//		List<WebElement> detailsOfUser = driver.findElements(By.xpath(xpath1));
//
//		ArrayList<String> contactList = new ArrayList<String>();
//
//		for (int i = 0; i < detailsOfUser.size(); i++) {
//			String text = detailsOfUser.get(i).getText();
//			System.out.println(text);
//			contactList.add(text);
//		}
//		return contactList;

	//}

	public static ArrayList<String> userInfo(String username) {
		String xpath1 = "//a[text() = '" + username + "']/parent::td/following-sibling::td";

		List<WebElement> detailsOfUser = driver.findElements(By.xpath(xpath1));
		ArrayList<String> contactList = new ArrayList<String>();

		for (WebElement e : detailsOfUser) {
			String text = e.getText();
			System.out.println(text);    //doubt in this line

			contactList.add(text);

		}
		return contactList;
	}

}
