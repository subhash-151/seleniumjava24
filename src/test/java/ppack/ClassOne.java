package ppack;

import org.testng.annotations.Test;

public class ClassOne {
	@Test(groups = { "smoke"})
	public void flipkart() {
		System.out.println("executing testOne from Classone");
	}
	@Test(groups={"Regression"})
	public void amazon() {
		System.out.println("executing testtwo from classone");
	}
	@Test(dependsOnMethods = {"flipkart"})
	public void myntra() {
		System.out.println("executing testthree from classone");
	}

}
