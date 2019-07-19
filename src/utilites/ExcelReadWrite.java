package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constantValuesPack.ConstantValues;

public class ExcelReadWrite {

	static XSSFWorkbook wb;
	static XSSFSheet ws;
	static XSSFCell c1;
	
//	static String excelPath = "C:\\Users\\supreet.paul\\Desktop\\UserLicenseAssignmentError.xlsx";
	
	public static void openExcelWorkbook(String pathName) throws Exception {
		//Opening a particular file
		File f = new File(pathName);
		
		//Reading the values from the file in the form of Raw data
		//Store all the values in java heap memory
		FileInputStream fis = new FileInputStream(f);
		
		//Assign the values back to excel WorkBook
		wb = new XSSFWorkbook(fis);	
	}
	
	
	public static String readValues(String sheetName, int rowNumber, int colNumber) {
		
		//It will assign a particular sheet to ws object that we need to work with
		ws = wb.getSheet(sheetName);
		
		//In order to reach a particular cell pass the row number and column number
		c1 = ws.getRow(rowNumber).getCell(colNumber);
		
		DataFormatter df = new DataFormatter();
		
		//Fetch the value from a particular cell and store it in a variable
		String cellValue = df.formatCellValue(c1);
		
		return cellValue;
	}
	
	public static void writeValues(String sheetName, int rowNumber, int colNumber, String testValue) throws Exception {
		//It will assign a particular sheet to ws object that we need to work with
		ws = wb.getSheet(sheetName);
		
		//In order to reach a particular cell pass the row number and column number
		c1 = ws.getRow(rowNumber).getCell(colNumber);
		
		//Method to write back in excel is setcellvalue
		c1.setCellValue(testValue);
		
		//Opening a particular file
		File f = new File(ConstantValues.excelPath);
		
		//Writing the values back to raw data from opened excel 
		//Store all the values in java heap memory
		FileOutputStream fos = new FileOutputStream(f);
		
		//The values will be written back and saved
		wb.write(fos);
		fos.close();
		
		//Open the file again to continue working with it
		FileInputStream fis = new FileInputStream(f);
		
	}
	
	public static int lastRowNumberMethod(String sheetName) {
		ws = wb.getSheet(sheetName);
		
		int lastNo = ws.getLastRowNum() + 1;
		return lastNo;
	}
	
}
