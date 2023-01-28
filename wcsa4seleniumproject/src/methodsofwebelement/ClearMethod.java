package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     driver.get("http://127.0.0.1/login.do");
	     WebElement UsernameTextbox = driver.findElement(By.name("username"));
	     UsernameTextbox.sendKeys("Admin");
	     
	      WebElement passwordTextbox = driver.findElement(By.name("pwd"));
	     passwordTextbox.sendKeys("manager");
	     Thread.sleep(2000);
	     
	     UsernameTextbox.clear();
	     passwordTextbox.clear();
	     
}
}

