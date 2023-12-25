package tpack;

import org.testng.annotations.Test;

public class ClassTwo {
	@Test(groups = {"smoke"},priority = 2)
	public void testThree() {
		System.out.println("executing testthree from classtwo");
	}
	@Test(groups= {"regression"})
	public void testFour() {
		System.out.println("executing testfour from classtwo");
	}

}
