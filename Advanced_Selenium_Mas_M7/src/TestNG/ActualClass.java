package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ActualClass extends Config {

	@Test
	public void test1() {
		System.out.println("Test 1 --- Actual Test Case");

		driver.findElement(By.name("q")).sendKeys("iPhone 14" + Keys.ENTER);

	}

//	@Test
//	public void test2() {
//		System.out.println("Test 2 --- Actual Test Case");
//	}

}
