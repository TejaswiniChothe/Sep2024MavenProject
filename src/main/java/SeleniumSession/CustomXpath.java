package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//xpath: is not an attribute/property
		//address of the element in html DOM
		
		//1. absolute xpath: /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
		//2. Relative xpath: custom xpath: functions, text, axes
		
		//using one attribute:

		//input[@id='input-email']
		//input[@name='email']
		//input[@placeholder='E-Mail Address']
		//input[@value='Login']
		
		//using two attributes:
		//htmltag[@attr1='value' and @attr2='value']
		//input[@type='submit' and @value='Login']
		
		//input[@type='text' and @name='email' and @placeholder='E-Mail Address']
		
		//a[@href] -- 81 -- FEs
		//input[@id] -- 6 -- FEs
		//input[@id and @type] -- 6 -- FEs
		
		//text():
		//htmltag[text()='value']
		//a[text()='Forgotten Password']
		//h1[text()='Register Account']
		//strong[text()='I am a returning customer']
		
		//text() and attribute:
		//htmltag[text()='value' and @attr='value']
		//htmltag[text()='value' and @attr1='value' and @attr2='value']
		//a[text()='Address Book' and @class='list-group-item']
		//a[@class='list-group-item' and text()='Address Book']
		
		//contains() with attribute:
		//htmltag[contains(@attr,'value')]
		//a[contains(@href,'route=account/recurring')]
		//input[contains(@placeholder,'E-Mail')]
		//input[contains(@placeholder,'Address')]
		
		//htmltag[contains(@attr,'value') and @attr2='value']
		//input[contains(@placeholder,'Address') and @name='email']
		
		//htmltag[contains(@attr,'value') and contains(@attr2,'value')]
		//input[contains(@placeholder,'Address') and contains(@id,'email')]
		
		//contains() with text():
		//htmltag[contains(text(),'value')]
		//p[contains(text(),'By creating an account')]
		//h2[contains(text(),'Returning')]
		
		String text = driver.findElement(By.xpath("//p[contains(text(),\"order's status\")]")).getText();
		System.out.println(text);
		
		//contains() with text() and attribute:
		//htmltag[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Recurring') and contains(@href,'route=account/recurring')]
		
		//dynamic attributes:
//		<input id="firstname_123">
//		<input id="firstname_456">
//		<input id="firstname_987">
		By.id("firstname_123");//not a valid locator
		By.xpath("//input[contains(@id,'firstname_')]");//valid
		
		//starts-with():
		//htmltag[starts-with(text(),'value')]
		//p[starts-with(text(),'By creating an account')]
		
//		<input id="firstname987login">
//		<input id="firstname654login">
		
		//ends-with(): not available in xpath
		
		//indexing in xpath:
		// (//input[@class='form-control'])[2]
		// (//input[@class='form-control'])[position()=2]
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("test");
		
		// (//input[@class='form-control'])[last()]
		// (//input[@class='form-control'])[last()-1]
		
		// (//a[@class='list-group-item'])[last()-1]
		
		//forgot password:
		//div[@class='list-group']/a[text()='Forgotten Password']
		// (//a[text()='Forgotten Password'])[2]
		
		
		
	}

}
