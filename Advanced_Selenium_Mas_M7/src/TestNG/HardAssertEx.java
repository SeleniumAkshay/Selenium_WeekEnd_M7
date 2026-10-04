package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {

	@Test
	public void facebook() throws InterruptedException {
		System.out.println("Hello Facebook");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		String title = driver.getTitle();
//		Assert.assertEquals(title, "Facebook");

		Assert.fail();

		String url = driver.getCurrentUrl();
//		Assert.assertNull(url);
		Assert.assertNotNull(url);

		boolean logo = driver.findElement(By.xpath("//div[@class='x106a9eq']")).isDisplayed();
		Assert.assertTrue(logo);
//		Assert.assertFalse(logo);

		Assert.assertNotEquals(title, "Faceboo");

		driver.findElement(By.xpath("//span[text()='Forgotten password?']")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
