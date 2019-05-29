package week2.day1;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement first = driver.findElementById("dropdown1");
		//		first.sendKeys("Selenium");
		Select dropDown = new Select(first);
		//		dropDown.selectByIndex(4);
		dropDown.selectByValue("2");
		WebElement dd2 = driver.findElementByName("dropdown2");
		Select dropDown2 = new Select(dd2);
		// To get the drop down size
		List<WebElement> options = dropDown2.getOptions();
		System.out.println(options.size());
		// selecting last option
		dropDown2.selectByIndex(options.size() -1);		
	}
}