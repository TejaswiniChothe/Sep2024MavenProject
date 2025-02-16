package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	@Test
	public void add()
	{
		System.out.println("test method");
		int a=10;
		int b=20;
		int Sum=a+b;
		Assert.assertEquals(Sum, 30,"--Not correct--");
	}

}
