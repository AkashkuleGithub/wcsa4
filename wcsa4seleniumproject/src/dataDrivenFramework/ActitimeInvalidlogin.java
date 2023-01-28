package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeInvalidlogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://127.0.0.1/login.do");
	    
	    Flib Flib = new Flib();
	  int rc = Flib.rowCount("./data/Atcitimetestdata", "invalidreads");
	    for(int i=1;i<=rc;i++)
	    {
	    
		String username = Flib.readExcelData("./data/Actitimetestdata.xlsx","invalidreads",i,0);
	       
	     String password = Flib.readExcelData("./data/Actitimetestdata.xlsx","invalidreads",i,1);
	      
	     
	    WebElement usn = driver.findElement(By.name("username"));
	     usn.sendKeys(username);
	     Thread.sleep(2000);
	     
		   WebElement pass = driver.findElement(By.name("pwd"));
		     pass.sendKeys(password);
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//a[.='Login']")).click();
	       
            Thread.sleep(2000);
	    driver.findElement(By.name("username")).clear();
	}
}
}
