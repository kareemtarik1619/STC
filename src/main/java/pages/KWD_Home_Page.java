package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KWD_Home_Page {
	
	
	WebDriver driver;

	public KWD_Home_Page(WebDriver driver) {
		this.driver = driver;

	}

	By country_btn = By.xpath("//span[@id='arrow']");

	public void clickcountry_btn() {
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(country_btn));
		driver.findElement(country_btn).click();
	}

	
	By KW_btn = By.xpath("//a[@id='kw']");

	public void clickKuwait_btn() {
		WebElement Kuwait = driver.findElement(KW_btn);
		assertEquals(Kuwait.getText(), "Kuwait");
		Kuwait.click();
	}

	By Plan_type = By.xpath("//strong[@id='name-lite']");

	public WebElement Plan_typ() {
		WebElement Plan = driver.findElement(Plan_type);
		return Plan;
	}

	By Price = By.xpath("//*[@id='currency-lite']//b[text()='1.2']");

	public WebElement Plan_Price() {
		WebElement PlanPrc = driver.findElement(Price);
		return PlanPrc;

	}

	By Currency = By.xpath("//*[@id='currency-lite']//i[text()='KWD']");

	public WebElement Plan_Currency() {
		WebElement Plan_Crnc = driver.findElement(Currency);
		return Plan_Crnc;
	}

}
