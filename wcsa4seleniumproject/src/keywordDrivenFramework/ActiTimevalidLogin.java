package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimevalidLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	Flib flib = new Flib();
	
	String Url = flib.readpropertyData("./data/config.properties","Url");
	String username = flib.readpropertyData("./data/config.properties","Username");
	String Password = flib.readpropertyData("./data/config.properties","Password");
	
	driver.get(Url);

	 driver.findElement(By.name("username")).sendKeys(username);
	 
	 driver.findElement(By.name("pwd")).sendKeys(Password);
	  
	  driver.findElement(By.id("loginButton")).click();
    Thread.sleep(2000);
    
	 }
	}


