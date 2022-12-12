package Sample_Maven_ELF39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demowebshop_SearchTest {
@Test

public void TC01() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("books");
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//driver.close();
	
}
}
