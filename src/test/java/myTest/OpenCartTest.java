package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;

public class OpenCartTest extends Base {
	
	@Test(enabled=false)
	public void titleTest() {
		String actTitle = driver.getTitle();
		System.out.println("title==>" + actTitle);
		Assert.assertEquals(actTitle, "Register Account");

	}
	@Test
	public void forgotPasswordLinkExist() {
		Assert.assertTrue(driver.findElement(By.linkText("Forgotten Password")).isDisplayed());
	}


}
