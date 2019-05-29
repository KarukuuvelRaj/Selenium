
package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class MergeLead extends BaseClass {
@Test()
	public void mergeLead() throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>();
		windowList.addAll(windowHandles);
		driver.switchTo().window(windowList.get(1));
		driver.findElementByName("firstName").sendKeys("Karthik");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(500);
		WebDriverWait wait = new WebDriverWait(driver, 7);
		//Thread.sleep(1000);
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		WebElement element = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		//String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		//driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(windowList.get(0));
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windowList2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(windowList2.get(1));
		driver.findElementByName("firstName").sendKeys("Gopi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(windowList.get(0));
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		String text = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if (text.equals("No records to display")) {
			System.out.println("No records display");
		} else {
			System.out.println("Records are display");
		}
	}

}


















