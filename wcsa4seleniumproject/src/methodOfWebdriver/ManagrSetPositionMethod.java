package methodOfWebdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagrSetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
       Thread.sleep(2000);
     Point targetposition =new Point(30, 250);
     driver.manage().window().setPosition(targetposition);
      

	}

}
