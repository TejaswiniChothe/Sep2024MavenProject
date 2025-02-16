package SeleniumSession;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeBrowerIncognitoMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeOptions eo=new EdgeOptions();
		eo.addArguments("--inPrivate");
		EdgeDriver driver=new EdgeDriver(eo);
		

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(driver.getTitle());
	}

}
