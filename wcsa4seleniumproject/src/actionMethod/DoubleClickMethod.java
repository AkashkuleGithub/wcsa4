package actionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

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
	     driver.findElement(By.xpath("//a[.='Login  ]")).click();
	     Thread.sleep(4000);
	     
	     driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
	     
	     driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	     
	     driver.findElement(By.xpath("//input[contains(@id,'uploadNewLogoOption')]")).click();
	     
	    WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));                 
	    
	      Actions act = new Actions(driver);

	      act.doubleClick(target).perform();
	}

}
