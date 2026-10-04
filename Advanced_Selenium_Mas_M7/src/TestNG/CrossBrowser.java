package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	WebDriver driver;

	@Parameters("browserName")
	@Test
	public void crossBrowserTest(String browser) throws InterruptedException {
		System.out.println("Cross Browser Test");

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Running test on Chrome browser");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("Running test on Edge browser");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Running test on Firefox browser");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please pass the correct browser name: " + browser);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 18 pro max" + Keys.ENTER);

		Thread.sleep(3000);
		driver.quit();

	}

}
