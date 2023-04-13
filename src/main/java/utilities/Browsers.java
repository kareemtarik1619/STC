package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browsers {

	public WebDriver driver;

	@Parameters("browser")

	@BeforeTest

	// Passing Browser parameter from TestNG xml

	public void beforeTest(String browser) {

		    // If the browser is Firefox, then do this

		if (browser.equalsIgnoreCase("firefox")) {

            //Initializing the firefox driver (Gecko)
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new FirefoxDriver(firefoxOptions);
			// driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {

			// Initialize the chrome driver
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			chromeOptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(chromeOptions);

			// driver = new ChromeDriver();

		}
		
		driver.get("https://subscribe.stctv.com/sa-en");
		driver.manage().window().maximize(); 
	}
		
		

	// Once Before method is completed, Test method will start
		@AfterTest
		public void afterTest() {

			driver.quit();

		}
	

}