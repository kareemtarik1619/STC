package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class KSA_Home_Page {

	WebDriver driver;

	public KSA_Home_Page(WebDriver driver) {
		this.driver = driver;

	}

	By country_btn = By.xpath("//span[@id='arrow']");

	public void clickcountry_btn() {
		new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.presenceOfElementLocated(country_btn));
		driver.findElement(country_btn).click();
	}

	By KSA_btn = By.xpath("//a[@id='sa']");

	public void clickKSA_btn() {
		WebElement KSA = driver.findElement(KSA_btn);
		assertEquals(KSA.getText(), "KSA");
		KSA.click();
	}

	By Plan_type = By.xpath("//strong[@id='name-classic']");

	public WebElement Plan_typ() {
		WebElement Plan = driver.findElement(Plan_type);
		return Plan;
	}

	By Price = By.xpath("//*[@id='currency-classic']//b[text()='25']");

	public WebElement Plan_Price() {
		WebElement PlanPrc = driver.findElement(Price);
		return PlanPrc;

	}

	By Currency = By.xpath("//*[@id='currency-classic']//i[text()='SAR']");

	public WebElement Plan_Currency() {
		WebElement Plan_Crnc = driver.findElement(Currency);
		return Plan_Crnc;
	}
}
