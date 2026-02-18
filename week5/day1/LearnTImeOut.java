package week5.day1;

import org.testng.annotations.Test;

public class LearnTImeOut {
	
	@Test(timeOut = 2000)
	public void runA() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("running runA ");
	}

	@Test(timeOut = 1000)
	public void runB() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("running runB ");
	}

}
