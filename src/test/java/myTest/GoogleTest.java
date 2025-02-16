package myTest;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import base.Base;

public class GoogleTest extends Base {

	@Test
	public void titleTest() {
		String actTitle = driver.getTitle();
		System.out.println("title==>" + actTitle);
		Assert.assertEquals(actTitle, "Google");

	}

	@Ignore
	@Test

	public void urlTest() {
		String actUrl = driver.getCurrentUrl();
		System.out.println("URL==>" + actUrl);
		Assert.assertTrue(actUrl.contains("google"));

	}
}
