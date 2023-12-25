package ppack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	WebDriver driver;
	ExtentReports extent;
	public void confriguration() {
		String filepath = System.getProperty("user.dir")+"\\reports\\extendReport.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter("filepath");
		reporter.config().setReportName("ATW testReport");
		reporter.config().setDocumentTitle("ATW reports");
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("operating system", "window");
		extent.setSystemInfo("tested by", "subhash");
	}
	@Test
	public void lunchurl() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String acttitle = driver.getTitle();
		String exttitle="H Y R Tutorials - H Y R Tutorials";
		
		Assert.assertEquals(acttitle, exttitle);
		System.out.println("vilidate successful");
		
	}
	

}
