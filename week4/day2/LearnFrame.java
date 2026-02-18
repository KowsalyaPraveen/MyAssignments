
package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://leafground.com/frame.xhtml");
		driver.switchTo().frame(0); // what will happen? text will be printed or  "NoSuchElement"exception will be shoot
		driver.findElement(By.id("Click")).click();
		System.out.println(driver.findElement(By.id("Click")).getText());
		driver.switchTo().defaultContent(); // shift the driver focus  to root html document
		driver.switchTo().frame(1); //NoSuchFrameException
		// what will happen? text will be printed or  "NoSuchElement"exception will be shoot
		System.out.println(driver.findElement(By.id("Click")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.xhtml']")));
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		// what will happen? text will be printed or any exception will be shooted
		System.out.println(driver.findElement(By.id("Click")).getText());
		driver.switchTo().parentFrame();//shift the driver focus  to <iframe src='page.xhtml'>
		driver.switchTo().parentFrame();//shift the driver focus  to root html document
		// step 1 : we have to choose our file type 
		//                   Capture the screenshot and store it in the specified location.
		File src = driver.getScreenshotAs(OutputType.FILE);
		// step 2 : we have to create a folder 
		// File class-- . name of the folder / name of the snapshot . image format
		File target = new File("./snap/frameSS.png");
		//step 3 : we are merging the source file with the destination file
		//  using the Apache.commons.io
		FileUtils.copyFile(src, target);	
		driver.close();
	}
}
