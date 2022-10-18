package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
	

	
	@Test
	public void searchTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	
	@Test
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}
	
	@Test
	public void logoTest() {
		Assert.assertTrue( driver.findElement(By.id("nav-logo-sprites")).isDisplayed()); 
		//boolean flag  = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		//System.out.println(flag);
		//Assert.assertEquals(flag, true);
		
	}
	

}


