package week5.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcel {

	public static void main(String[] args) throws IOException {
		// Step1-> Set path for workbook
		XSSFWorkbook excel = new XSSFWorkbook("./data/CreateLead.xlsx");
		// step2-> Get into the sheet
		XSSFSheet sheet = excel.getSheet("Sheet1");
		// Step3-> Get the total no of Rows in the sheet
		int totalRowCount = sheet.getLastRowNum();
		System.out.println("total Row Count " + totalRowCount);
		// Step4-> Get the total no of columns in the sheet
		short totalColumnCount = sheet.getRow(totalRowCount).getLastCellNum();
		System.out.println("total Column Count " + totalColumnCount);
		for (int i = 0; i <= totalRowCount; i++) {
			System.out.print("|");
			for (int j = 0; j < totalColumnCount; j++) {
				// Step5-> Read Data from workbook and print
				String testData = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(testData + "|");
			}
			System.out.println();
		}

		// Step6-> close the workbook
		excel.close();
	}

}
