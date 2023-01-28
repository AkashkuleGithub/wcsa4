package methodOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.get("https://www.instagram.com/");
			String titleofwebpage = driver.getTitle();
			System.out.println(titleofwebpage);
	}

}