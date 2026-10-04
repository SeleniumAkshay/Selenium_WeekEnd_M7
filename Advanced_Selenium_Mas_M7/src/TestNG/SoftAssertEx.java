package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {

	@Test
	public void facebook() throws InterruptedException {
		System.out.println("Hello Facebook");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		String title = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title, "Faceboo");

		driver.findElement(By.xpath("//span[text()='Forgotten password?']")).click();

		sa.assertAll();
		Thread.sleep(3000);
		driver.quit();
	}

}
