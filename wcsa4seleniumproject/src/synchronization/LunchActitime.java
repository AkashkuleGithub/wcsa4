package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchActitime {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		     driver.get("http://127.0.0.1/login.do");
		    String actualloginpageTitle = driver.getTitle();
		    if (actualloginpageTitle.equals("actiTIME - Login")) {

		    	System.out.println("login page Title is  Match:test case is pass");
		    }
		    else
		    {
		    	System.out.println("login psge Title is not match:Test case is fail");
		    }
		    { 
		    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		     
		     driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		    
		     driver.findElement(By.xpath("//a[.='Login']")).click();
		     Thread.sleep(8000);
		     String actualhomepageTitle = driver.getTitle();
		     if (actualhomepageTitle.equals("actiTIME - Enter Time-Track")) {
				
		    	 System.out.println("Homepage Title is match:Test case is pass");
			}
		     else
		     {
		    	 System.out.println("Homepage Title is not Match:Test case is fail");
		     }
}
	}
}