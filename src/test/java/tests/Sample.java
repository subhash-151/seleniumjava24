package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Sample {

	public static void main(String[] args) throws Exception {
	Properties prop= new Properties();
	FileInputStream fis = new FileInputStream("\"C:\\Users\\sr43097\\Subhash\\MVTproject\\data.properties\"");
	prop.load(fis);
  System.out.println(prop.getProperty("url"));
  System.out.println(prop.getProperty("email"));
  System.out.println(prop.getProperty("password"));
 
	}

}
