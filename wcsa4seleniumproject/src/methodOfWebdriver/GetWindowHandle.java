package methodOfWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://omayo.blogspot.com/");
	    Thread.sleep(2000);	
	    
	    driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	    String parentHandle = driver.getWindowHandle();
	    System.out.println(parentHandle);
	    
	 
            
	}
}
