
package week2.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>();
		windowList.addAll(windowHandles);
		driver.switchTo().window(windowList.get(1));
		Thread.sleep(4000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		//driver.findElementByXPath("//input[@id='partyIdTo']/following-sibling::a").click();
		driver.switchTo().window(windowList.get(1));
		Thread.sleep(4000);
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		driver.switchTo().alert().accept();
	}

}
