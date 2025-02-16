package testng;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	
	
@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;//AE
		ExpectedExceptionConcept obj = null;
		obj.name = "tom";//NPE
	}

}
