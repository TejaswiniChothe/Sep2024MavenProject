package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectTag {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.cardekho.com");

		Thread.sleep(4000);

		driver.findElement(By.id("vehicleTypeName")).sendKeys("S");// search the element by using S
		Thread.sleep(4000);

		// once you find the SUV element in auto suggestion then click on it
		driver.findElement(By.xpath("//li[contains(text(),'SUV')]")).click();

	}

}
