package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

	@DataProvider(name = "loginData")
	public String[][] data() {

		String[][] userData = new String[3][2];
		userData[0][0] = "qspiders51@gmail.com";
		userData[0][1] = "Qsp@1234";

		userData[1][0] = "qspiders2596@gmail.com";
		userData[1][1] = "Qsp@1234";

		userData[2][0] = "seleniumqspmas@gmail.com";
		userData[2][1] = "Qsp@1234";

		return userData;

	}

	@Test(dataProvider = "loginData")
	public void login(String username, String password) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");

		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password + Keys.ENTER);

		Thread.sleep(3000);
		driver.quit();

	}

}
