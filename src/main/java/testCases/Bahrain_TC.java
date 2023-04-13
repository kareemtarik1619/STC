package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.Bahrain_Home_Page;
import pages.KSA_Home_Page;
import utilities.Browsers;
import utilities.ScreenShots;

public class Bahrain_TC extends Browsers {

	
	Bahrain_Home_Page home;
	ScreenShots Screen;
	@Test (enabled = true, priority = 1, description = "Validate Bahrain Plan Type")
	@Severity(SeverityLevel.NORMAL)
	@Feature("Bahrain Plan Type")
	public void Plane_typeTC() throws InterruptedException, IOException {
		
		home = new Bahrain_Home_Page(driver);
		home.clickcountry_btn();
		home.clickBH_btn();
		String Plan =home.Plan_typ().getText();
		assertEquals(Plan, "PREMIUM");
		Screen = new ScreenShots();
		Screen.particular_element(home.Plan_typ());		
		System.out.println(Plan);
	}



	@Test (enabled = true, priority = 2 , description = "Validate Bahrain Plan Currency")
	@Severity(SeverityLevel.BLOCKER)
	@Feature("Bahrain Plan Currency")
	public void Plane_CurrencyTC() throws InterruptedException, IOException {


		String PlanCurrency =home.Plan_Currency().getText();
		assertEquals(PlanCurrency, "BHD/month");
		Screen = new ScreenShots();
		Screen.particular_element(home.Plan_Currency());
		System.out.println(PlanCurrency);
	}
	
	@Test (enabled = true, priority = 3, description = "Validate Bahrain Plan Price" )
	@Severity(SeverityLevel.CRITICAL)
	@Feature("Bahrain Plan Price")
	public void Plane_PriceTC() throws InterruptedException, IOException {

			
		String PlanPrice =home.Plan_Price().getText();
		assertEquals(PlanPrice, "6");
		Screen = new ScreenShots();
		Screen.particular_element(home.Plan_Price());
		Screen.full_Screen(driver);
		System.out.println(PlanPrice);
	}

}
