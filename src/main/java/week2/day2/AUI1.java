package week2.day2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AUI1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).pause(3000).perform();
		driver.findElementByLinkText("Apple").click();

	}

}
