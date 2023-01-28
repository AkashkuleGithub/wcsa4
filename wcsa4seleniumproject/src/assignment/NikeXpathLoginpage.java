package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NikeXpathLoginpage {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.nike.com/my/member/profile/login?continueUrl=https://www.nike.com/my/");
	     driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("akashkule01@gmail.com");
	     driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//input[@class='submitting']")).click();
	     Thread.sleep(2000);
	     

	}

}
