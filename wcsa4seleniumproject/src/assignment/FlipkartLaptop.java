package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaptop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click(); 
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Core i7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Brand']")).click();
		driver.findElement(By.xpath("//div[.='HP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Hard Disk Capacity']")).click();
		driver.findElement(By.xpath("//div[.='1 TB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='4★ & above']")).click();
		Thread.sleep(2000);
	String price = driver.findElement(By.xpath("//div[@class='_4rR01T']/../following-sibling::div[@class='col col-5-12 nlI3QM']//div[@class='_30jeq3 _1_WHN1']")).getText();
	System.out.println(price+" : price of hp laptop");
	driver.quit();
		
	}

}
