package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.KWD_Home_Page;
import utilities.Browsers;
import utilities.ScreenShots;

public class Kuwait_TC extends Browsers {
	KWD_Home_Page home;
	ScreenShots Screen;

	@Test(enabled = true, priority = 1, description = "Validate BHD Plan Type")
	@Severity(SeverityLevel.BLOCKER)
	@Feature("BHD Plan Type")
	public void Plane_typeTC() throws InterruptedException, IOException {

		home = new KWD_Home_Page(driver);
		home.clickcountry_btn();
		home.clickKuwait_btn();
		String Plan = home.Plan_typ().getText();
		assertEquals(Plan, "LITE");
		Screen = new ScreenShots();
		Screen.particular_element(home.Plan_typ());
		System.out.println(Plan);
	}

	@Test(enabled = true, priority = 2, description = "Validate KSA BHD Currency")
	@Severity(SeverityLevel.NORMAL)
	@Feature("BHD Plan Currency")
	public void Plane_CurrencyTC() throws InterruptedException, IOException {

		String PlanCurrency = home.Plan_Currency().getText();
		assertEquals(PlanCurrency, "KWD/month");
		Screen = new ScreenShots();
		Screen.particular_element(home.Plan_Currency());
		System.out.println(PlanCurrency);
	}

	@Test(enabled = true, priority = 3, description = "Validate KSA Plan Price")
	@Severity(SeverityLevel.CRITICAL)
	@Feature("BHD Plan Price")
	public void Plane_PriceTC() throws InterruptedException, IOException {

		String PlanPrice = home.Plan_Price().getText();
		assertEquals(PlanPrice, "1.2");
		Screen = new ScreenShots();
		Screen.particular_element(home.Plan_Price());
		Screen.full_Screen(driver);
		System.out.println(PlanPrice);
	}

}
