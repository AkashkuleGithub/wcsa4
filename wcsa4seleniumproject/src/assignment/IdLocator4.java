package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.drupal.org/user/login");
		
		driver.findElement(By.name("name")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("akashk@21");
		Thread.sleep(2000);
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
