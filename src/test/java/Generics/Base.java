package Generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base {
	protected WebDriver driver;
	protected String txtTo;
	protected String txtForm;
	protected ExtentTest test;
	ExtentReports report;

	@BeforeClass
	public void setup() throws IOException {
		driver = new ChromeDriver();

		Properties properties = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Abhisek Baral\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\SeleniumProject1\\src\\test\\resources\\config.properties");
		properties.load(file);

		String urlString = properties.getProperty("url");
		txtTo = properties.getProperty("priceRange1");
		txtForm = properties.getProperty("priceRange2");

		// Extent report implementation
		report = new ExtentReports(
				"C:\\Users\\Abhisek Baral\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\SeleniumProject1\\report.html");
		test = report.startTest("Naptol Navigating");

		driver.get(urlString);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		test.log(LogStatus.PASS, "Entered URL");

	}

	@AfterClass
	public void teardown() {
		report.flush();
		report.endTest(test);
		driver.quit();
	}

}
