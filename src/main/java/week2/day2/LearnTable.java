package week2.day2;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("TVR", Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(3000);
		List<WebElement> trains = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr");
		System.out.println(trains.size());
	}
}
