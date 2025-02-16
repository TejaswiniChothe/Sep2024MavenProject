package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAnnoatation {

	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BT-Connect with DB");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BT-launchBrowser");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("BT-LoginToApp");
	}

	@Test
	public void getTitlTest() {
		System.out.println("BT-get Title");
		Assert.assertEquals(false, true);
	}

	@Test
	public void getURL() {
		System.out.println("BT-get URL");
	}

	@Test
	public void searchTest() {
		System.out.println("BT-Search test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("BT-logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("BT-closeBrowser");
	}

	@AfterTest
	public void deleteBrowser() {
		System.out.println("BT-deleteBrowser");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("BT-disconnectDB");
	}
	
	
	

}
