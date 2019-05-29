package week2.day1;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement userName = driver
				.findElementById("username");
		userName.sendKeys("DemoSalesManager", Keys.TAB);
		Thread.sleep(3000);
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit")
		.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
