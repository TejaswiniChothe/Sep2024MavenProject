package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// 1. id: unique attribute - I
		driver.findElement(By.id("input-firstname")).sendKeys("Naveen");

		// 2. name: attribute: can be duplicate -- II
		driver.findElement(By.name("lastname")).sendKeys("testing");

		// 3. className: class attribute: can be duplicate -- III
		// driver.findElement(By.className("form-control")).sendKeys("naveen@gmail.com");

		// 4. xpath: is not an attribute, its a locator: address of the element in html
		// dom
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("98989898987");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("naveen@gmail.com");

		// 5. css Selector: is not an attribute, its a locator
		driver.findElement(By.cssSelector("#input-password")).sendKeys("naveen@123");
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("naveen@123");

		// 6. linkText: only for links: htmltag = <a>
		driver.findElement(By.linkText("Login")).click();
		// driver.findElement(By.linkText("Register")).click();

		// 7. partialLinkText: only for links: htmltag = <a>
		// Forgotten Username
		// Forgotten Password
		driver.findElement(By.partialLinkText("Forgotten")).click();

		// 8. tagName: htmltag: should be unique
		String forgotPwdheader = driver.findElement(By.tagName("h1")).getText();
		System.out.println(forgotPwdheader);
		
	}

}
