package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomeCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/legacy");
		Thread.sleep(5000);
		// css: cascaded style sheet
		// cssSelector: is a locator

		// For Id loactor below syntax is followed
		// #id == #input-email
		// tag#id == input#input-email

		//

		// For Id loactor below syntax is followed
		// .classname ==.form-control
		// tag.classname == input.form-control

		// If you have multiple class in element. in below element we have two class
		// form-control and input-lg
		// <input type="text" name="search" value="" placeholder="Search"
		// class="form-control input-lg">
		// .c1.c2 == .form-control.input-lg
		// tag.c1.c2.c3...cn == input.form-control.input-lg

		// We can use id and class together

		// #id.class == #input-email.form-control
		// .class#id == .form-control#input-email
		// tag#id.class == input#input-email.form-control
		// tag.class#id == input.form-control#input-email

		// for other attributes other than class and id:
		// tag[attr='value'] == input[name='email']
		// for other attributes(multiple)
		// tag[attr1='value'][attr2='value'] == input[name='email'][placeholder='E-Mail
		// Address']

		// This will give total no of item avaliable with particular attribute without
		// giving value= input[id][placeholder][name] --> this give 2 element
		// You can further filter out using id ==
		// input[id][placeholder][name]#input-password

		// text in css: no support for text in CSS

		// contains:
		// tag[attr *= 'value'] == input[placeholder *= 'Address']

		// startwith:
		// tag[attr ^= 'value'] == input[placeholder ^= 'E-Mail']

		// endswith:
		// tag[attr $= 'value'] == input[placeholder $= 'Address']

		// parent to child:
		// https://app.hubspot.com/login/legacy
		// parentTag childTag --> direct + indirect child elements == form#hs-login div
		// -24
		// div#content form input#input-email ==> in this div is parent class, form is
		// indirect child hence space is used, input is indirect child of form hence
		// space is used and then it is filtered out by using ID

		// parentTag > childTag --> direct child elements == form#hs-login > div -- 8

		// https://www.orangehrm.com/30-day-free-trial
		// in this case output is same for direct and indirect child
		// select#Form_getForm_Country option -233
		// select#Form_getForm_Country>option -233

		// child to parent: NA -- backward traversing is not allowed in CSS

		// sibling in css: only for following sibling is allowed
		// + will give only immediate following sibling
		// https://naveenautomationlabs.com/opencart/index.php?route=account/login
		// label[for='input-email']+input#input-email

		// https://www.orangehrm.com/30-day-free-trial
		// to get all the sibling you have use ~
		// option[value='Afghanistan'] ~ option

		// index in css:
		// select#Form_getForm_Country > option:nth-of-type(2)- 2nd index
		// select#Form_getForm_Country > option:nth-of-type(n) -all element
		// select#Form_getForm_Country > option:first-child -- first child
		// select#Form_getForm_Country > option:last-child -- child child

		// select#Form_getForm_Country > option:nth-child(5) --5th option --> this is
		// similar to nth of type
		// select#Form_getForm_Country > option:nth-last-child(5) -- 5th from the last
		// select#Form_getForm_Country > option:nth-last-child(2) -- 2nd from the last
		// select#Form_getForm_Country > option:nth-last-child(n) -- all elements

		// select#Form_getForm_Country > option:nth-child(odd)
		// select#Form_getForm_Country > option:nth-child(even)

		// odd/even in xpath:
		// 10 % 2 == 0 --even
		// 9% 2 == 1 -- odd

		// select[@id='Form_getForm_Country']/option[position() mod 2 = 0] --- even
		// select[@id='Form_getForm_Country']/option[position() mod 2 = 1] -- odd

		// comma in css=input#username, input#password, input#remember, button#loginBtn
		//We can maintain multiple element in single locator

		By impElements = By.cssSelector("input#username, input#password, input#remember, button#loginBtn");

		List<WebElement> impEleList = driver.findElements(impElements);

		System.out.println(impEleList.size());

		if (impEleList.size() == 4) {
			System.out.println("login form having all imp elements");
		} else {
			System.out.println("FAIL");
		}
		
		// not in css:
		//input.form-control:not(input[name='search'])
		//input.form-control:not(input[name='search']):not(#input-telephone) ==> if you want to exclude one more item

		
		

//      xpath                 vs                             css
//1.syntax            complex                                 easy
//2.performance       good                					  good
//3.text              yes										no
//4. sibling           yes                                     limited(only following)
//5. child to parent   yes             							no
//6. parent to child	yes										yes
//7. backward traverse  yes                						no
//8. index				yes										yes(+1)	
//9. not                yes										yes
//10. comma/union		yes										yes
//11. endswith          no                             			yes
//12. contains			yes										yes
//13. startswith		yes										yes
//14. space:            yes										no
//15. SVG				yes										limited
//16. SHADOW DOM		no										yes	
//17. Relative Locators	yes										yes

	}

}
