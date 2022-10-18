package TestNgSession;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void searchTest() {
		System.out.println("searchTest");
		int i = 9/0;
	}

}
