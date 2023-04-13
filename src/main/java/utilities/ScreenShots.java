package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ScreenShots  {

	public void full_Screen(WebDriver driver) throws IOException {
		Random rn = new Random();
		int number = rn.nextInt(100) + 1;
		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(), "PNG", new File("C:\\projectScreenshots\\fullPageScreenshot"+number+".png"));

	}

	public void particular_element(WebElement element) throws IOException {
		Random rn = new Random();
		int number = rn.nextInt(100) + 1;
		File f = element.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(f, new File("C:\\projectScreenshots\\logoScreeshot"+number+".png"));

	}
}
