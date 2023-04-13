package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bahrain_Home_Page {

	WebDriver driver;

	public Bahrain_Home_Page(WebDriver driver) {
		this.driver = driver;

	}

	By country_btn = By.xpath("//span[@id='arrow']");

	public void clickcountry_btn() {
		new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.presenceOfElementLocated(country_btn));
		driver.findElement(country_btn).click();
	}

	By BH_btn = By.xpath("//a[@id='bh']");

	public void clickBH_btn() {
		WebElement Bahrain = driver.findElement(BH_btn);
		assertEquals(Bahrain.getText(), "Bahrain");
		Bahrain.click();

	}

	By Plan_type = By.xpath("//strong[@id='name-premium']");

	public WebElement Plan_typ() {
		WebElement Plan = driver.findElement(Plan_type);
		return Plan;
	}

	By Price = By.xpath("//*[@id='currency-premium']//b[text()='6']");

	public WebElement Plan_Price() {
		WebElement PlanPrc = driver.findElement(Price);
		return PlanPrc;

	}

	By Currency = By.xpath("//*[@id='currency-premium']//i[text()='BHD']");

	public WebElement Plan_Currency() {
		WebElement Plan_Crnc = driver.findElement(Currency);
		return Plan_Crnc;
	}

}
