package week4.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class ProjectThird {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElementById("email").sendKeys("k.velu93@gmail.com");
		driver.findElementById("password").sendKeys("apple@1993");
		driver.findElementById("buttonLogin").click();
		Thread.sleep(3000);
		WebElement vendors = driver.findElementByXPath("//button[text()=' Vendors']");
		Actions mouse = new Actions(driver);
		mouse.moveToElement(vendors).pause(2000).perform();
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorTaxID").sendKeys("RO212121");
		driver.findElementById("buttonSearch").click();
		String vendorName = driver.findElementByXPath("//table[@class='table']//td").getText();
		System.out.println("Vendor Name is: "+vendorName);
		driver.quit();
	}

}
