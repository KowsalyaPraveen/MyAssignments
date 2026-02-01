package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.leafground.com/table.xhtml");
		// step 1 : Identify the table
		// step 2 : Identify the total no of rows 
		int totalNoOfRows = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr")).size();
		// step 3 : Identify the total no of columns/ fields
		int totalNoOfColumns = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//th")).size();
		System.out.println("total No Of Rows in the table is : "+totalNoOfRows);
		System.out.println("total No Of Columns in the table is : "+totalNoOfColumns);
		// outer for loop --> totalNoOfRows
		// inner for loop --> totalNoOfColumns
		// Step 4: Extract the data present inside the table
		for (int i = 1; i <=totalNoOfRows ; i++) { // [row]*[column]
			System.out.print("|");
			for (int j = 1; j <=totalNoOfColumns; j++) {
				String dataFromTable = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(dataFromTable+"|");
			}
			System.out.println();
			
		}
	}

}
