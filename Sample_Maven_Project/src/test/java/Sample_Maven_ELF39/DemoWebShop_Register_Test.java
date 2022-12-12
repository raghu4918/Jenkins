package Sample_Maven_ELF39;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShop_Register_Test {
	@Test
	public void p2() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Raghu");
	driver.findElement(By.id("LastName")).sendKeys("M");
	driver.findElement(By.id("Email")).sendKeys("raghu1233@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("123456789asdf");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789asdf");
	driver.findElement(By.id("register-button")).click();
	}
	

}
