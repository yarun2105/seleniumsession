package TestNgSession;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	
	//AAA rule in test unit
	// arrange    act     assert  
	
	public void createAUser() {
		System.out.println("creating a user");
	}
	
	@Test
	public void createUser() {
		createAUser();
		System.out.println("createUser");
	}
	
	
//	@Test(dependsOnMethods = "createUser")
//	public void updateUser() {
//		System.out.println("updateUser");
//	}
//	
//	
//	@Test(dependsOnMethods = "createUser")
//	public void deleteUser() {
//		System.out.println("deleteUser");
//	}
	
	@Test
	public void updateUser() {
		createAUser();
		System.out.println("updateUser");
	}
	
	@Test
	public void deleteUser() {
		createAUser();
		System.out.println("deleteUser");
	}

}
