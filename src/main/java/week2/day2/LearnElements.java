package week2.day2;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LearnElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.crystalcruises.com/voyage-finder");
		WebElement dest = driver
				.findElementByLinkText("Destinations");
		dest.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN);
		/*Thread.sleep(5000);
		List<WebElement> allDetails = driver.findElementsByXPath("//span[@class='dest_1']");
		System.out.println(allDetails.size());	
		WebElement lastDetail = allDetails.get(allDetails.size()-1);
		String text = lastDetail.getText();
		System.out.println(text);*/
	}
}
