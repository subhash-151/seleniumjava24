package ppack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CrearandWriteExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb= new XSSFWorkbook();
		 XSSFSheet sheet = wb.createSheet();
		 sheet.createRow(0);
		 sheet.getRow(0).createCell(0).setCellValue("hello");
		 sheet.getRow(0).createCell(1).setCellValue("world");
		 sheet.createRow(1);
		 sheet.getRow(1).createCell(0).setCellValue("subhash");
		 sheet.getRow(1).createCell(1).setCellValue("kumar");
		 
		 File file= new File("C:\\Users\\sr43097\\Subhash\\MVTproject\\ExcelFile\\test.xlsx");
		 FileOutputStream fis=new FileOutputStream(file);
		wb.write(fis);
		 wb.close();

	}

}
