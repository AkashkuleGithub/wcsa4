package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmvaliddata {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
   Flib Flib = new Flib();
   
String username = Flib.readExcelData("./data/orangehrmtestdata.xlsx","validreads",1,0);
   
 String password = Flib.readExcelData("./data/orangehrmtestdata.xlsx","validreads",1,1);
 
  driver.findElement(By.name("username")).sendKeys(username);
 
driver.findElement(By.name("password")).sendKeys(password);
 
 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
 
}
}
