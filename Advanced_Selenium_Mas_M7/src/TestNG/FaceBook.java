package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBook {

	@Test
	public void facebook() throws InterruptedException {
		System.out.println("Hello Facebook");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		String title = driver.getTitle();
		if (title.equals("Instagram")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		driver.findElement(By.xpath("//span[text()='Forgotten password?']")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
