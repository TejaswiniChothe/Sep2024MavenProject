package SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomAssigment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(3000);

		
		String jsPathforIframe="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		String jsPathforDestiy="return document.querySelector(\"#glaf\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement iframeEle=(WebElement)js.executeScript(jsPathforIframe);
		driver.switchTo().frame(iframeEle);
		
		
		WebElement Destiny = (WebElement)js.executeScript(jsPathforDestiy);
		Destiny.sendKeys("Test");
		


	}

}
