package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrameElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.bluestone.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.id("confirmBtn")).click();
	    
	     driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster     ']")).click();
	    
	     WebElement frameElement = driver.findElement(By.id("fc_widget"));
	     driver.switchTo().frame(frameElement);
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("chat-icon")).click();
	     
	     driver.switchTo().defaultContent();
	     
	     driver.findElement(By.id("chat-fc-name")).sendKeys("admin");
	}

}
