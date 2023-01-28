package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PumaShoexpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://in.puma.com/in/en?gclid=CjwKCAiA-dCcBhBQEiwAeWidtXE5YbaebJHB8N0R2ALu9KBc2M2AA3ZhGTGGoR8mT-APsySiMej7jhoCwzAQAvD_BwE&utm_aud=OTH&utm_campaign=PS_GGL_SEA_TXT_OTH_Brand_Category_New&utm_medium=PS&utm_obj=OLC&utm_source=GGL-SEA");

	}

}
