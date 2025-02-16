package testng;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test()
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
	}

	@Test(dependsOnMethods = "loginTest")
	public void homeTest() {
		System.out.println("home test");
		int i = 9/0;
	}

	@Test(dependsOnMethods = "homeTest")
	public void cartTest() {
		System.out.println("cart test");
	}
}
