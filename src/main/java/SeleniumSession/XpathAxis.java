package SeleniumSession;

public class XpathAxis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. direct child: / -- only direct child elements
		//2. indirect child: // --> direct+indirect child elements
		//<footer>
		//  <header>- this is direct child of footer
	    //    <span>-this is indirect child of footer
		
		//1.https://naveenautomationlabs.com/opencart/index.php?route=account/login
		//form//input[@id] -- 2  == input is indirect child of form, when we filter that out using id attributes then 2 elements are found
		////form//input[@id and @placeholder] - it will filter out the element based on id & placeholder attributes
		
		//2.https://www.orangehrm.com/30-day-free-trial
		//select[@id='Form_getForm_Country']//option--> option is direct child of select,it will give 233 record, // gives direct+indirect child, for direct child you can mention // as well
		//select[@id='Form_getForm_Country']/option--> 
		
		//3.https://app.hubspot.com/login/legacy
		//form[@id='hs-login']//input- 3 indirect child are avaliable
		//form[@id='hs-login']//input- 0 - direct child are not avaliable
		
		//div[@class='private-form__input-wrapper']/input[@id='username']--> input is direct child of div so / is used, and it it further filter by using id attribute of element
		//To make it more readble you can write it in below way:
		//div[@class='private-form__input-wrapper']/child::input[@id='username']
		//div[@class='private-form__input-wrapper']//child::input[@id='username']--> as it is direct child you can use // as well

		
		//form[@id='hs-login']//input[@id='username']-->Input is indirect child of div so // is used, and it it further filter by using id attribute of element
		//To make it more readble you can write it in below way:
		//form[@id='hs-login']//child::input[@id='username']
		
		//https://naveenautomationlabs.com/opencart/index.php?route=account/register
		//Parent to child
		//form[@class='form-horizontal']//child::input[@placeholder]-->6 element found
		//form[@class='form-horizontal']//input[@placeholder]-->6 element found
		
		//backward traversing in DOM:
	   //child to direct parent
		
		//input[@id='input-firstname']/../../../../../../../../..   ==> after the xpath of child element keep writing /.. until yu reached to specific parent element. you can write//.. as well
		//Another way to write it to make it more readble
		//input[@id='input-firstname']/parent::div/parent::div/parent::fieldset/parent::form/parent::div
		
		
		//child to Ancestor(grandparent)-->it will give direct and indirect parent
		//input[@id='input-firstname']/ancestor::form
		
		//sibling:
		//https://naveenautomationlabs.com/opencart/index.php?route=account/login
		//following sibling
		//label[text()='E-Mail Address']/following-sibling::input[@id='input-email']//input is following sibling of label tag , input tag is below label tag,we traversing from lable to input
		
		
		//preceding-sibling
		//input[@id='input-email']/preceding-sibling::label[text(),'E-Mail Address']//input tag is below label tag,we traversing from input to label
				
		//(//span[text()='Sikandar Raza'])[1]/ancestor::td/following-sibling::td//span[text()='lbw b Rashid Khan']
		

	}

}
