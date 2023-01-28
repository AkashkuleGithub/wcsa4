package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///C:/Automation/wcsa4%20new/confirm.html");
	    
	   WebElement button = driver.findElement(By.xpath("//button[.='click me! ']"));
	   button.click();
	   
	   Alert al = driver.switchTo().alert();
	   Thread.sleep(2000);
	    al.accept();
	   
	   //al.dismiss();
	    
	    String Textofconfirm = al.getText(); 
		  System.out.println(Textofconfirm);
		  
	   

	}

}
