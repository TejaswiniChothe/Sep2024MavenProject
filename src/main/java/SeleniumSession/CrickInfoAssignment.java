package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickInfoAssignment {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/afghanistan-in-zimbabwe-2024-25-1457916/zimbabwe-vs-afghanistan-3rd-odi-1457925/full-scorecard");
		String BrainCaughtoutbyDetails = getBowlerDetails("Brian Bennett");
		System.out.println("Caugth out by details for Brian:"+BrainCaughtoutbyDetails);
		
		List<String> BrainDetails = getScoreDetails("Brian Bennett");
		System.out.println("ScoreCard Details of Brain:"+BrainDetails);
		
		System.out.println("----------------");

		String JoylordCaughtoutbyDetails = getBowlerDetails("Joylord Gumbie");
		System.out.println("Caugth out by details for Joylord:"+JoylordCaughtoutbyDetails);
		
		List<String> JoylordDetails = getScoreDetails("Joylord Gumbie");
		System.out.println("ScoreCard Details of Joylord:"+JoylordDetails);

	}

	public static String getBowlerDetails(String userName) {

		// (//span[text()='Brian Bennett']/ancestor::td/following-sibling::td//span)[2]
		WebElement BowlerName = driver.findElement(
				By.xpath("(//span[text()='" + userName + "']/ancestor::td/following-sibling::td//span)[2]"));
		String BowlerNameDetails=BowlerName.getText();
		return BowlerNameDetails;
	}
	
	
	public static List<String> getScoreDetails(String userName) {

		//span[text()='Brian Bennett']/ancestor::td/following-sibling::td[contains(@class,'ds-w-0 ds-whitespace-nowrap')]
		List<WebElement> Scorecard = driver
				.findElements(By.xpath("//span[text()='" + userName + "']/ancestor::td/following-sibling::td[contains(@class,'ds-w-0 ds-whitespace-nowrap')]"));

		List<String> ScorecardList = new ArrayList<String>();// []

		for (WebElement e : Scorecard) {
			String text = e.getText();
			ScorecardList.add(text);
		}

		return ScorecardList;
	}
}
