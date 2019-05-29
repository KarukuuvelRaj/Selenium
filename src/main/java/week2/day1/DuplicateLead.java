package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").clear();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Vishal");
		driver.findElementByClassName("smallSubmit").click();
		driver.close();
	}

}
