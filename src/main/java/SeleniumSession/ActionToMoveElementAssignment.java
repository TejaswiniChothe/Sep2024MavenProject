package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionToMoveElementAssignment {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By LaptopsProduct = By.xpath("//a[text()='Laptops & Notebooks']");
		By WindowsProduct = By.xpath("//a[contains(text(),'Windows')]");
		handleTwoLevelMenuSubMenuHandling(LaptopsProduct, WindowsProduct);

	}
	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void handleTwoLevelMenuSubMenuHandling(By parentMenuLocator, By childMenuLocator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenuLocator)).build().perform();
		getElement(childMenuLocator).click();

	}

}
