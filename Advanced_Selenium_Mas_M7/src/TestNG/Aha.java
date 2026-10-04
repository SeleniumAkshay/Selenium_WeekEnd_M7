package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Aha {

	@Test
	public void aha() throws InterruptedException {
		System.out.println("Aha Test");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.aha.video/");

		System.out.println(driver.getCurrentUrl());

		Thread.sleep(3000);
		driver.quit();

	}

}
