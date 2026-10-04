package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest extends Config {

	@Test(retryAnalyzer = RetryEx.class)
	public void test1() throws InterruptedException {
		System.out.println("Test 1");
		Thread.sleep(2000);
		Assert.fail();
	}

}
