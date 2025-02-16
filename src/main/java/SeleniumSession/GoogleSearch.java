package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		// Locator of Search field
		By searchField = By.name("q");

		// Locator of AutoSuggesstion field

		By suggestions = By.xpath("//ul[@class='G43f7e']/li//div[@class='wM6W7d']/span");

		doSearch(searchField, suggestions, "selenium", "selenium webdriver");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doSearch(By searchField, By suggestions, String searchKey, String actualValue)
			throws InterruptedException {

		//get the search field and pass the sendKey
		getElement(searchField).sendKeys(searchKey);
		Thread.sleep(2000);

		//get all the auto suggestion list
		List<WebElement> SuggList = getElements(suggestions);
		//Print the size of of auto suggestion list
		System.out.println(SuggList.size());

		//Iterate the suggestion list using for loop
		for (WebElement e : SuggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(actualValue)) {
				e.click();
				break;
				//once you get the expected value from autosggestion list than break the loop
			}

		}
	}

}
