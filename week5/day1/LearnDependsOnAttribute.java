package week5.day1;

import org.testng.annotations.Test;

public class LearnDependsOnAttribute {
	
	@Test
	public void runA()
	{
		System.out.println("running runA ");
	}

	@Test(dependsOnMethods = {"runC"})
	public void runB()
	{
		System.out.println("running runB ");
	}

	@Test(dependsOnMethods = {"runA"})
	public void runC()
	{
		System.out.println("running runC ");
	}

	@Test
	public void runD()
	{
		System.out.println("running runD ");
	}

}
