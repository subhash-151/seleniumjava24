package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {
	@BeforeSuite
	public void mtest() {
		System.out.println("will execute before executing all the test module");
	}
    @BeforeTest
	public void setup() {

		System.out.println("launching browser and navigating to app url");
     }
    @Test(priority = 1)
	public void logintest() {
		System.out.println("login is successful");
	}
    @Test(priority = 2)
	public void searchProductTest() {
		System.out.println("search product is successful");
	}
    @Test(priority = 3)
	public void addToCartTest() {
		System.out.println("addTocart is successful");
	}
    @Test(priority = 4)
	public void logoutTest() {
		System.out.println("logout is successful");
	}
    @AfterTest
    public void tearDown() {
    	System.out.println("close the browser");
    }
    @AfterSuite
    public void ntest() {
    	System.out.println("will execute after executing all the test module");
    }
}
