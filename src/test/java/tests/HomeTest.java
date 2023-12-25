package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import pages.HomePage;
import pages.LandingPage;

public class HomeTest extends Base_Library {

	HomePage aa;

	@BeforeTest
	public void setUp() {
		lunchUrl();
		aa =new HomePage();
	}
	@Test(priority = 1)
	public void clickClose() throws Exception {
		aa.clickOnClose();
	}
	
	@Test(priority = 3)
	public void clickpractice() throws InterruptedException {
		aa.clickOnpractice();
	}
	@Test(priority = 4)
	public void clickelement() throws InterruptedException {
		aa.clickOnElement();
	}
	/*
	 * @AfterTest public void tearDown() { driver.close(); }
	 */
}
