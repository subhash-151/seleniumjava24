package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import pages.LandingPage;

public class LandingTest extends Base_Library {
	
	LandingPage aa;
	
	@BeforeMethod
	public void setUp() {
		lunchUrl();
		aa =new LandingPage();
		
	}
	@Test(enabled = false)
	public void closeButton() {
		aa.clickOnClose();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	
	}
}
