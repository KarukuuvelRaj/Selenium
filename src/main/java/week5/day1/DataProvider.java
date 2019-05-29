package week5.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class DataProvider extends BaseClass {
@Test(dataProvider="fetchInput")
	public void createLead(String cname, String fname, String lname) {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
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
@org.testng.annotations.DataProvider(name= "fetchInput")
public String[][] getData() {
	String[][] inputs = new String [2][3];
	inputs[0][0] = "HCL";
	inputs[0][1] = "Raj";
	inputs[0][2] = "R";
	inputs[1][0] = "CTS";
	inputs[1][1] = "Guru";
	inputs[1][2] = "M";
	return inputs;
}
}








