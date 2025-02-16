package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDomAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// <input type="text" name="email" value="" placeholder="E-Mail Address"
		// id="input-email" class="form-control">

		// To print placehoder value>> getAttribute methode is depreceated
//		WebElement email_ID = driver.findElement(By.id("input-email"));
//		String placeHoldervalue= email_ID.getAttribute("placeholder");
//		System.out.println(placeHoldervalue);
//
//		// Use getDomAttribute method
//
//		String placeHoldervalue = email_ID.getDomAttribute("placeholder");
//		System.out.println(placeHoldervalue);
//
//		// to capture the properties of other attribute
//		String outerHtmlVal = email_ID.getDomProperty("outerHTML");
//		System.out.println(outerHtmlVal);
//
//		String ID = email_ID.getDomProperty("id");
//		System.out.println(ID);
//
//		System.out.println("----");
//		// How to confirm the text entered in field
//		email_ID.sendKeys("Tej@gmail.com");
//
//		// <input type="text" name="email" value="" placeholder="E-Mail Address"
//        //The Value attribute holds the value being entered
//		//In case of value attribute you have to use getDomProperty, this is the way it is designed
//		String emailText = email_ID.getDomProperty("value");
//		System.out.println(emailText);
		
		By email=By.id("input-email");
		System.out.println(doGetDomAttribute(email,"placeholder"));
		getElement(email).sendKeys("tej11@gmailc.om");
		String emailText=doGetDomProperty(email,"value");
		System.out.println(emailText);

	}
	
	public static String doGetDomAttribute(By locator, String attrName)
	{
		return getElement(locator).getDomAttribute(attrName);
	}
	

	public static String doGetDomProperty(By locator, String propName)
	{
		return getElement(locator).getDomProperty(propName);
	}
	

	public static WebElement getElement(By locator) 
	{
	  return driver.findElement(locator);
	}

}
