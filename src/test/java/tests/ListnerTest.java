package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(tests.Listener.class)
public class ListnerTest {
	
	public static WebDriver driver;
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		 driver.findElement(By.xpath("name=\"password\"")).sendKeys("admin123");
		 driver.findElement(By.xpath("type=\"submit\"")).click();
	}
	
	public void testTofail() {
		System.out.println("this method to test fails");
	Assert.assertTrue(false);
	}

}
