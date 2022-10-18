package mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();
		driver = new  ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//table[@id = 'customers' ]//tr
		
		int rowCount = getRowCount();
		System.out.println("rows:"+ rowCount);
		
		int columnCount = getColumnCount();
		System.out.println("column:"+columnCount);

	}
	
	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id = 'customers' ]//tr")).size()-1;
		
		
	}
	
	public static int getColumnCount() {
		return driver.findElements(By.xpath("//table[@id = 'customers' ]//th")).size();
	
	}

}
