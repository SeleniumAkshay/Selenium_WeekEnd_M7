package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersEx implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {

		TakesScreenshot ts = (TakesScreenshot) Config.sDriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/listeners.png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
