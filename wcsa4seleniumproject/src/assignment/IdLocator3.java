package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("akashk@21");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
