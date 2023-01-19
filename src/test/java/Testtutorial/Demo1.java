package Testtutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void abc() throws InterruptedException
	{
		Thread.sleep(10000);
		Assert.assertTrue(true);
	}

}
