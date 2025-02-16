package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");// parent window
		String parentWindowId = driver.getWindowHandle();

		// selenium 4.x
		//driver.switchTo().newWindow(WindowType.TAB);// open a new blank tab/window and switch to it
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");

		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("main window title: " + driver.getTitle());
	}

}
