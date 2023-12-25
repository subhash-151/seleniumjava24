package ppack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.poifs.macros.VBAMacroExtractor;
import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;


public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
	String	excelpath="C:\\Users\\sr43097\\Subhash\\MVTproject\\excelfiles\\demo.xlsx.xlsx";
	FileInputStream fis= new FileInputStream(excelpath);
	XSSFWorkbook wb= new XSSFWorkbook(fis);
     XSSFSheet sheet = wb.getSheetAt(0);
	  int rows = sheet.getLastRowNum();
	    int cols = sheet.getRow(0).getLastCellNum();
	    
	    //for using For loop
	    
	    for (int r = 0; r < rows;r++) {
	    	
	    	XSSFRow Row = sheet.getRow(r);
	    	for (int c = 0; c < cols; c++) {
	    		XSSFCell cell = Row.getCell(c);
	    		switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					
					break;
					
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());

				default:
					
					break;
				}
				
			}
	    	System.out.println();
	    
	    	
			
		}
	      
	        
	      
	}

	
	


}

