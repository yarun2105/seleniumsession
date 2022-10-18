package TestNgSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgConcept {
	
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("connectWithDB ...........Before suite method");
	}
	
	
	@BeforeTest
	public void createUser() {
		System.out.println("createUser................Before Test method");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launchBrowser...........Before class method");
	}
	
	@BeforeMethod
	public void Login() {
		System.out.println("doLogin...........Before  method");
	}
	

	@Test
	public void searchTest() {
		System.out.println("search..........Test Method");
	}
	
	@Test
	public void addToCartTest() {
		System.out.println("addToCartTest");
	}
	
	@Test
	public void paymentTest() {
		System.out.println("paymentTest");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("logOut.........After method");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("closeBrowser....After class method");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("deleteUser...........After test method");
	}
	
	@AfterSuite
	public void disconnetWithDB() {
		System.out.println("disconnetWithDB.......After suite method");
	}
	
	

}
