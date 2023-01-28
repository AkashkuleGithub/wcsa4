package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeXpathLoginpage {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("http://127.0.0.1/login.do");
		    Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		     Thread.sleep(4000);
		     driver.findElement(By.xpath("//a[.='Login']")).click();
		     Thread.sleep(4000);
		     driver.quit();

	}

}
