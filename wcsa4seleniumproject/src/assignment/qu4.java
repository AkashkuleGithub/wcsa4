package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qu4 {

	public static void main(String[] args) throws InterruptedException {
		//how to close child browser?
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("https://omayo.blogspot.com/");
	    Thread.sleep(2000);	
	    
	    driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	    
	    String parenthandle = driver.getWindowHandle();
	    System.out.println(parenthandle);
	    System.out.println("-----------------------------------------");
	    
	    
	    Set<String> Allhandles = driver.getWindowHandles();
	    for(String wh:Allhandles)
	    
	    {
	    	System.out.println(wh);
	    	if (!parenthandle.equals(wh)) 
	    	driver.switchTo().window(wh).close();
	    
	   else
	   {
	   }
			}
	    	
	    }

	}


