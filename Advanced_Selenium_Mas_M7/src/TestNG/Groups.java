package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Groups {

	@Test(groups = "smoke",dependsOnGroups = "regression")
	public void facebook() throws InterruptedException {
		System.out.println("Facebook Test");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("testuser");

		Thread.sleep(1000);
		driver.quit();
	}

	@Test(groups = "system")
	public void amazon() throws InterruptedException {
		System.out.println("Amazon Test");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com/");

		Thread.sleep(2000);
		System.out.println("Title of the page is: " + driver.getTitle());

		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test(groups = "regression")
	public void flipkart() throws InterruptedException {
		System.out.println("Flipkart Test");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		System.out.println("Title of the page is: " + driver.getTitle());

		Thread.sleep(3000);
		driver.quit();
	}

}
