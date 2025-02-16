package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

//		WebElement adons=driver.findElement(By.xpath("//div[text()='Add-ons']"));
//		WebElement visaServices = driver.findElement(By.xpath("//div[text()='Visa Services']"));
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(adons).build().perform();
//		Thread.sleep(2000);
//		visaServices.click();

		By adons = By.xpath("//div[text()='Add-ons']");
		By visaServices = By.xpath("//div[text()='Visa Services']");
		handleTwoLevelMenuSubMenuHandling(adons, visaServices);
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
