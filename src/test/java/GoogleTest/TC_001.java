package GoogleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_001 {
	
	@BeforeTest
	public void OpenBrowser() {
		
	}

	@Test
	public void Test_1()  {
		// Search Dhaka 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("q")).sendKeys("Dhaka University");
		driver.findElement(By.className("btnK")).click();
		
		
	}
	@AfterTest
	public void CloseBrowser() {
		
	}
}
