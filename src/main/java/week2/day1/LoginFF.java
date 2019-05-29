package week2.day1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFF {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement userName = driver
				.findElementById("username");
		userName.sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit")
		.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
