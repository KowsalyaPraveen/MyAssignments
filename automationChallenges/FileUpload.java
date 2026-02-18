package automationChallenges;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String pathOfMyProjectFolder = System.getProperty("user.dir"); //project path
	
		String filepath = pathOfMyProjectFolder+"\\data\\Bala_CV.docx";  //Absolute path of the file
		System.out.println(filepath); 
		driver.get("https://www.file.io/");
		Thread.sleep(5000);
		WebElement uploadButton = driver.findElement(By.xpath("//input[@type='file']"));
//		driver.executeScript("arguments[0].click()", uploadButton);
//		
//		// Store the copied text in the clipboard
//			StringSelection stringSelection = new StringSelection(filepath);
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//			
//			//selenium 3 
//			
//			Robot robot = new Robot();
//
//			// Enter to confirm it is uploaded
//			robot.keyPress(KeyEvent.VK_CONTROL);			
//			robot.keyPress(KeyEvent.VK_V);
//          C:\SessionProjects\InterviewPreparation\AutomationChallenges\data\Bala_CV.docx
//			robot.keyRelease(KeyEvent.VK_V);
//			robot.keyRelease(KeyEvent.VK_CONTROL);	
//
//			Thread.sleep(5000);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//		  Selenium 4
		  uploadButton.sendKeys(filepath); // absolute path
		  
		  

	}

}