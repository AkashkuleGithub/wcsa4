package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramXpathLoginpage {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.drivr","./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.instagram.com/");
	    Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("manager");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	     Thread.sleep(4000);
	     driver.quit();
	}

}
