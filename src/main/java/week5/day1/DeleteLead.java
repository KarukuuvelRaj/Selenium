package week5.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class DeleteLead extends BaseClass {
	@Test
	public void deleteLead() {

		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByLinkText("Delete").click();

	}

}
