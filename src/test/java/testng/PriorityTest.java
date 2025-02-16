package testng;

import org.testng.annotations.Test;

public class PriorityTest {

	// TODO Auto-generated method stub
	// tcs should be independent
	// AAA -> Arrange act assert

	@Test()
	public void aTest() {
		System.out.println("a test");
	}

	@Test()
	public void bTest() {
		System.out.println("b test");
	}

	@Test()
	public void cTest() {
		System.out.println("c test");
	}

	@Test(priority = 2)
	public void dTest() {
		System.out.println("d test");
	}

	@Test(priority = 1)
	public void eTest() {
		System.out.println("e test");
	}

}
