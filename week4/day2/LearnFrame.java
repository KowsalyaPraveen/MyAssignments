package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws IOException{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		driver.navigate().to(url);
		System.out.println("Launched url: "+url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().frame("iframeResult");
		System.out.println("Switched to frame");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Clicked on Try it button");
		driver.switchTo().alert().accept();
		System.out.println("Accepted the alert");
		String text=driver.findElement(By.id("demo")).getText();
		System.out.println("Verified the Text "+text);
		File src=driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./snap/frameSS.png");
		FileUtils.copyFile(src, target);
		driver.quit();

	}

}
