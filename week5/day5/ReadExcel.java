package week5.day5;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	public static String[][] extractDataFromExcel(String fileName) throws IOException {
		// Step1-> Set path for workbook 
		XSSFWorkbook excel; // declaration
		excel = new XSSFWorkbook("./data/"+fileName+".xlsx");
		// step2-> Get into the sheet
		XSSFSheet sheet = excel.getSheet("Sheet1");
		//Step3-> Get the total no of  Rows in the sheet
		int totalRowCount = sheet.getLastRowNum();
		// Excepted value = 3
		System.out.println("total Row Count is : "+totalRowCount);
		//Step4-> Get the total no of  columns in the sheet
		short totalColumnCount = sheet.getRow(totalRowCount).getLastCellNum();
		// Excepted value = 4
		System.out.println("total Column Count is : "+totalColumnCount);
		// Step 5 --> Create a 2D array     //index 2<3        //index 3 < 4 
		String [][] testRecord = new String[totalRowCount][totalColumnCount];
		
		//Step6-> Read Data from workbook and print 
		            //  3<=3 --> true
		for (int i = 1; i <= totalRowCount; i++) { // represents Row in the sheet
			System.out.print("|");
			for (int j = 0; j < totalColumnCount; j++) { // represents column in the sheet
				String testData = sheet.getRow(i).getCell(j).getStringCellValue();
				testRecord[i-1][j]=testData;
				System.out.print(testData+"|");
			}
			System.out.println();
		}
		// Step7-> close the workbook
		excel.close();
		System.out.println("extractDataFromExcel from ReadExcel");
		return testRecord;
	}
}