package mavenselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// x-path is used to find the address of the element in DOM

		// 1. Absolute xpath // /html/body/header/div/div/div[2]/div/input absolute
		// xpath is from first nod to root nod.

		// 2. relative x path

		// formula for creating x path

		// htmltag[@attribute = 'value']

		// input[@name = 'email'] for username

		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("test@gmailcom");

		List<WebElement> textElement = driver.findElements(By.xpath("//h2"));
		for (WebElement e : textElement) {
			String text = e.getText();
			System.out.println(text);
		}

		// text()

		// htmltag[text() = 'value']
		// h2[text() = 'Returning Customer']

		String text = driver.findElement(By.xpath("//h2[text() = 'Returning Customer']")).getText();
		System.out.println(text);

		// text() with attribute //text() with two attribute also applicable

		// htmltag[text() = 'value'and @attribute = 'value']
		// a[text() = 'Register' and @class="list-group-item"]

		String linktext = driver.findElement(By.xpath("//h2[contains(text(), 'Returning')]")).getText();
		System.out.println(linktext);

		// contains() with attribute

		// htmltag[contains(@attribute, 'value')]

		// input[contains(@id , 'email')]

		// conains() with text()
		// htmltag[contains(text(), 'value')]
		// h2[contains(text(), 'Returning')]

		// contains() with attribute and contains with text()

		// htmltag[contains(@attribute , 'value') and contains(text(), 'value')]

		// a[contains(@class, 'dropdown-toggle') and contains( text(), 'Desktops')]

		// contains() with text() and attribute
		// htmltag[contains(text(),'value')and @attribute = 'value']

		// starts-with() attribute
		// tag[starts-with(@attribute, 'value')]

		// input[starts-with(@name, 'search')]

		driver.findElement(By.xpath("//input[starts-with(@name, 'search')]")).sendKeys("selenium");

		// starts-with() text()
		// htmltag[starts-with(text(), 'value')]
		// h2[starts-with(text(), 'New')]

		String linktext1 = driver.findElement(By.xpath("//h2[starts-with(text(), 'New')]")).getText();
		System.out.println(linktext1);

		// strong[starts-with(text(), 'I am')]

		String text1 = driver.findElement(By.xpath("//strong[starts-with(text(), 'I am')]")).getText();
		System.out.println(text1);
		if (text1.contains("returning")) {
			System.out.println("pass");
		}

		// starts-with() text() and starts-with() @attribute

		// htmltag[starts-with(text(),'value')and starts-with(@attribute,'value')]

		// a[starts-with(text(),'Laptops')and starts-with(@class,'dropdown')]

		// index concept in xpath

		// (//input[@class = 'form-control'])[1] firstname lastname email phone pass
		// pass

		// driver.findElement(By.xpath("(//input[@class =
		// 'form-control'])[1]")).sendKeys("Arun");

		By register = By.xpath("//a[text() = 'Register' and @class='list-group-item']");
		
		doClick(register);
		
		

		By firstname = By.xpath("(//input[@class = 'form-control'])[1]");
		By LAStname = By.xpath("(//input[@class = 'form-control'])[2]");
		By EMAIL = By.xpath("(//input[@class = 'form-control'])[3]");
		By PHONE = By.xpath("(//input[@class = 'form-control'])[4]");
		By pass = By.xpath("(//input[@class = 'form-control'])[5]");
		By cpass = By.xpath("(//input[@class = 'form-control'])[6]");

		doSendKeys(firstname, "Arun");
		doSendKeys(LAStname, "yadav");
		doSendKeys(EMAIL, "arun@gmail.com");
		doSendKeys(PHONE, "686649479249");
		doSendKeys(pass, "Arun123");
		doSendKeys(cpass, "Arun123");
		
		Thread.sleep(5000);
		
		By checkout = By.xpath("//span[text()= 'Checkout']");
		doClick(checkout);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doSendKeys( By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
