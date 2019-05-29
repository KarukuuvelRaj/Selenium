package week4.day1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class windowHandles {
	public ChromeDriver driver;
	@BeforeMethod
	public void startChrome() {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
	}
	@Test
	public void windowHandle1() {
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			String title = driver.getTitle();
			if(title.contains("PlayGround"))
				break;
		}
	}
	@Test
	public void windowHandle2() {
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> allWindowHandles = allWindows.iterator();
		boolean hasNext = allWindowHandles.hasNext();
	}
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
}
