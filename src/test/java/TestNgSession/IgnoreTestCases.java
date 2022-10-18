package TestNgSession;

import org.testng.annotations.Test;

public class IgnoreTestCases {
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test
	public void pageTitleTest() {
		System.out.println("pageTitleTest");
	}
	
	@Test
	public void logoTest() {
		System.out.println("logoTest");
	}
	
	@Test(enabled = false)
	public void paymentTest() {
		System.out.println("paymentTest ");
	}

	
	




}
