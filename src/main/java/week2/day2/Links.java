package week2.day2;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Links {
	public ChromeDriver driver;
	@BeforeMethod
	public void startChrome() {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");
	}
	@Test
	public void click() {
		driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
	}
	@Test
	public void sendKeys() {
		driver.findElementByLinkText("Find where am supposed to go without clicking me?").sendKeys(Keys.ENTER);
	}
	@Test
	public void actionsClass() {
		Actions builder = new Actions(driver);
		WebElement linkEle = driver.findElementByLinkText("Find where am supposed to go without clicking me?");
		builder.moveToElement(linkEle).click().perform();
	}
	@Test
	public void javaScript() {
		WebElement linkEle = driver.findElementByLinkText("Find where am supposed to go without clicking me?");
		driver.executeScript("arguments[0].click;", linkEle);
	}
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
}
