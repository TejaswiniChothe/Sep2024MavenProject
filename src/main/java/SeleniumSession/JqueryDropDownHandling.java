package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");

		// Locator for choice dropdown
		By choiceDropDown = By.id("justAnInputBox");

		// Locator for choices in dropdown
		By choices = By.xpath(
				"//h3[text()='Multi Selection']/following-sibling::div//span[contains(@class,'comboTreeItemTitle')]");

		// tc1: single choice
		//selectChoice(choiceDropDown, choices, "choice 3");

		// tc2: multiple choices
		//selectChoice(choiceDropDown, choices, "choice 3", "choice 2", "choice 2 2", "choice 7");
		

		// tc3: all choices
		selectChoice(choiceDropDown, choices, "All");

	}
	//to print this document type/** and enter button
	/**
	 * 
	 * @param choiceDropDown
	 * @param choices
	 * @param choiceValue
	 * @throws InterruptedException
	 */

	public static void selectChoice(By choiceDropDown, By choices, String... choiceValue) throws InterruptedException {
		// String .... choicevalue >> Three dot parameter >this is being used to allow
		// multiple selection

		// locate choiceDropDown and click on it
		driver.findElement(choiceDropDown).click();
		Thread.sleep(4000);
		// Locate the dropdown list using finde elements and store it into LIst
		List<WebElement> choicesList = driver.findElements(choices);
		System.out.println(choicesList.size());// Print size of choice list

		// This if loops is for selecting, single, multiple or all choices
		if (choiceValue[0].equalsIgnoreCase("all")) {
			// select all the choice one by one:
			for (WebElement e : choicesList) {
				e.click();
			}
		} else {
			for (WebElement e : choicesList) {
				String text = e.getText();
				System.out.println(text);

				for (String ch : choiceValue) {
					if (text.equals(ch)) {
						e.click();
					}
				}
			}
		}

	}
}
