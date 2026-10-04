package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersEx.class)
public class ListenersTest extends Config {

	@Test
	public void test1() {
		System.out.println("Test 1");
		
		driver.findElement(By.id("acqw")).click();
		
	}

}
