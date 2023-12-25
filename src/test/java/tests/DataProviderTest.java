package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "getdata")
	public void loginTest(String username,String password) {
		System.out.println("user logged to the apps using username:"+username);
		System.out.println("user logged to the apps using password:"+password);
	}
	@DataProvider
	public Object[] getdata() {
		Object[][] data= new Object[3][2];
		data[0][0]="subhash";
		data[0][1]="12345";
		data[1][0]="suman";
		data[1][1]="67890";
		data[2][0]="dilip";
		data[2][1]="246810";
	
		
		
		return data;
		
	}

}
