package week5.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class EditLead extends BaseClass {
@Test()
	public void editLead() {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementByXPath("(//input[@class='inputBox'])[3]").clear();
		driver.findElementByXPath("(//input[@class='inputBox'])[3]").sendKeys("Raghav");
		driver.findElementByClassName("smallSubmit").click();
		
	}

}
