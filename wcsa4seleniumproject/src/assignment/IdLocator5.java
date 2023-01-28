package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://forum.openkm.com/ucp.php?mode=login&redirect=ucp.php%3Fmode%3Dlogin&sid=f6f586f0b8854c456670c99c08ea4212");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("akashk@21");
		Thread.sleep(2000);
		driver.findElement(By.id("load")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
