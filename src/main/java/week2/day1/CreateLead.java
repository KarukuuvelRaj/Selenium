package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		driver.findElementById("createLeadForm_firstName").sendKeys("Karthik");
		driver.findElementById("createLeadForm_lastName").sendKeys("Raj");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select sel = new Select(source);
		sel.selectByVisibleText("Employee");
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marcam = new Select(marketingCampaign);
		marcam.selectByValue("CATRQ_CARNDRIVER");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select ind = new Select(industry);
		ind.selectByIndex(15);
		/*List<WebElement> allOptions = sel.getOptions();
		System.out.println(allOptions.size());  
		for (WebElement each : allOptions) {
			System.out.println(each.getText());
		}*/
		
		driver.findElementByClassName("smallSubmit").click();
	}
}








