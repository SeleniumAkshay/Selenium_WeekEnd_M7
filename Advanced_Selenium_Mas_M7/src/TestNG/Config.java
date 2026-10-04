package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Config {
	
	WebDriver driver;
	static WebDriver sDriver;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite --- DataBase Connection");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test --- Reports Generation");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class --- Launch Browser");
		
		String browser="chrome";
		
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

		sDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method --- Login to App");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method --- Logout from App");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class --- Close Browser");
		driver.quit();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test --- Reports End");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite --- DataBase Connection Closed");
	}

}
