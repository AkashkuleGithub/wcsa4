package pageobjectmode;

import java.io.IOException;

public class ActitimeValidLogin  extends BaseTest {

	public static void main(String[] args) throws IOException,InterruptedException {
		//for open the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//read the data from property file
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.actiTimeValidLOgin(flib.readpropertyData(PROP_PATH, "Username"),flib.readpropertyData(PROP_PATH, "Password"));
		
	}

}
