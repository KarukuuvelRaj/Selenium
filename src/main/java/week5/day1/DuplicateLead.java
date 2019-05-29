package week5.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class DuplicateLead extends BaseClass {
@Test
	public void duplicateLead() {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").clear();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Vishal");
		driver.findElementByClassName("smallSubmit").click();
		
	}

}
