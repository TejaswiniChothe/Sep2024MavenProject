package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegisterPage {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		Actions act = new Actions(driver);
		
		Action action =	act.sendKeys(firstName, "Tejaswini")
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys("Chothe")
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys("tej112@gmail.com")
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys("8989898989")
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys("Test@1234")
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys("Test@1234")
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys(Keys.SPACE)//This will click on checkbox
				.pause(500)
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys(Keys.ENTER)//This will click on continue button
				.build();
		
		action.perform();

		

	}

}
