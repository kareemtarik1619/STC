package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.KSA_Home_Page;
import utilities.Browsers;
import utilities.ScreenShots;

public class KSA_TC extends Browsers {

	KSA_Home_Page home;
	ScreenShots Screen;

	@Test(enabled = true, priority = 1, description = "Validate KSA Plan Type")
	@Severity(SeverityLevel.CRITICAL)
	@Feature("KSA Plan Type")
	public void Plane_typeTC() throws InterruptedException, IOException {

		home = new KSA_Home_Page(driver);
		home.clickcountry_btn();
		home.clickKSA_btn();
		String Plan = home.Plan_typ().getText();
		assertEquals(Plan, "CLASSIC");
		Screen = new ScreenShots();
		Screen.particular_element(home.Plan_typ());
		System.out.println(Plan);
	}

	@Test(enabled = true, priority = 2, description = "Validate KSA Plan Currency")
	@Severity(SeverityLevel.NORMAL)
	@Feature("KSA Plan Currency")
	public void Plane_CurrencyTC() throws InterruptedException, IOException {

		String PlanCurrency = home.Plan_Currency().getText();
		assertEquals(PlanCurrency, "SAR/month");
		Screen = new ScreenShots();
		Screen.particular_element(home.Plan_Currency());
		System.out.println(PlanCurrency);
	}

	@Test(enabled = true, priority = 3, description = "Validate KSA Plan Price")
	@Severity(SeverityLevel.BLOCKER)
	@Feature("KSA Plan Price")
	public void Plane_PriceTC() throws InterruptedException, IOException {

		String PlanPrice = home.Plan_Price().getText();
		assertEquals(PlanPrice, "25");
		Screen = new ScreenShots();
		Screen.particular_element(home.Plan_Price());
		Screen.full_Screen(driver);
		System.out.println(PlanPrice);
	}

}
