package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownAllOption {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		By country = By.id("Form_getForm_Country");

		int i = getOptionCount(country);
		if (i == 133) {
			System.out.println("Count is Correct:" + i);
		} else {
			System.out.println("Count is ICorrect:" + i);
		}
		System.out.println("-----------------");
		printDropDownText(country);
		
		System.out.println("-----------------");
		List<String> countryOptionList=getDropDownOptionsTextList(country);
		System.out.println(countryOptionList);
		System.out.println(countryOptionList.contains("India"));

		
	}

	public static WebElement getElement(By loactor) {
		return driver.findElement(loactor);
	}

	public static int getOptionCount(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> countryOptionList = select.getOptions();
		System.out.println("Option size is:" + countryOptionList.size());
		return countryOptionList.size();
	}

	public static void printDropDownText(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> OptionList = select.getOptions();
		for (WebElement e : OptionList) {
			String text = e.getText();
			System.out.println(text);

		}
	}
	
	public static List<String> getDropDownOptionsTextList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsValueList = new ArrayList<String>();// []
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsValueList.add(text);
		}
		return optionsValueList;
	}

}
