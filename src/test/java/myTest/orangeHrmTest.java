package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;

public class orangeHrmTest extends Base {

	@Test
	public void titleTest() {
		String actTitle = driver.getTitle();
		System.out.println("title==>" + actTitle);
		Assert.assertEquals(actTitle, "30-Day Advanced Free Trial | OrangeHRM");

	}

	@Test
	public void privacyPolicyExist() {
		Assert.assertTrue(driver.findElement(By.linkText("Privacy Policy.")).isDisplayed());
	}
}
