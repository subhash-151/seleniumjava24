package baselibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import excelutility.excel_utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Library implements excel_utility {
	public static WebDriver driver;
   
	public void lunchUrl() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.testingbaba.com/old");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
	}

	public void getreadData(int sheet, int row, int col) {
		
		
	}

}
