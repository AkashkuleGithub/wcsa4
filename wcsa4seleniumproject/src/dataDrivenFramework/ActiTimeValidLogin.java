package dataDrivenFramework;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ActiTimeValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("http://127.0.0.1/login.do");
	    
       Flib Flib = new Flib();
       
	String username = Flib.readExcelData("./data/Actitimetestdata.xlsx","validreads",1,0);
       
     String password = Flib.readExcelData("./data/Actitimetestdata.xlsx","validreads",1,1);
      
      driver.findElement(By.name("username")).sendKeys(username);
      
     Thread.sleep(2000);
	     driver.findElement(By.name("pwd")).sendKeys(password);
	     driver.findElement(By.xpath("//a[.='Login']")).click();
       
	    
	    
	}

	}
