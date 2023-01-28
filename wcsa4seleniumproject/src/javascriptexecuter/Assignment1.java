package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("file:///C:/Automation/wcsa4%20new/disabledenbledwebelement.html");
		    
		   WebElement Username = driver.findElement(By.id("i1"));
		   WebElement password = driver.findElement(By.id("i2"));
		   
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
		   
		   if (Username.isEnabled()) 
		   {
			   Username.sendKeys("admin");
			   System.out.println("if block will get executed");
		   }
		   else
		   {
			   jse.executeScript("document.getElementById('i1').value='admin'");
			   System.out.println("Else block is executed");
		   }
		   if (password.isEnabled()) 
		   {
			  password.sendKeys("manager");
			   System.out.println("if block will get executed");
		  
		   }
		   else
		   {

			   jse.executeScript("document.getElementById(\"i2\").value='manager'");
			   System.out.println("Else block is executed");
		   }
			   
		   }
				

	}


