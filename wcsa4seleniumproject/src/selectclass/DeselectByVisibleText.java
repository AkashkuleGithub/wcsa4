package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		//chakli

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     
	     driver.get("file:///C:/Automation/wcsa4%20new/multiple%20selectdown.html");
	     WebElement dropdownElement = driver.findElement(By.id("i1"));
	     Select sel = new Select(dropdownElement);
	
	     sel.deselectByVisibleText("chakali");
	     Thread.sleep(5000);
	     
	     sel.deselectByVisibleText("chakali");
	     
	}

}
