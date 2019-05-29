package steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class CreateLeadSteps {
	SuperClass meth = new SuperClass();
	@Given("Open the Browser")
	public void openTheBrowser() {
		meth.openTheBrowser();
	}
	@Given("Maximise the Browser")
	public void maximiseTheBrowser() {
		meth.maximiseTheBrowser();
	}
	@And("Set the Timeout")
	public void setTheTimeout() {
		meth.setTheTimeout();
	}
	@And("Enter the URL")
	public void enterTheURL() {
		meth.enterTheURL();
	}
	@And("Enter the Username as (.*)")
	public void enterTheUsername(String uname) {
		meth.enterTheUsernameAsDemoSalesManager(uname);
	}
	@And("Enter the Password as (.*)")
	public void enterThePasswordAsCrmsfa(String password) {
		meth.enterThePasswordAsCrmsfa(password);
	}
	@When("Click on the Login Button")
	public void clickOnTheLoginButton() {
		meth.clickOnTheLoginButton();
	}
	@Then("Verify Home Page is displayed")
	public void verifyHomePageIsDisplayed() {
		meth.verifyHomePageIsDisplayed();
	}
	@When("Click on the CRM\\/SFA link")
	public void clickOnTheCRMSFALink() {
		meth.clickOnTheCRMSFALink();
	}
	@And("Click on the Leads link")
	public void clickOnTheLeadsLink() {
		meth.clickOnTheLeadsLink();
	}
	@And("Click on the CreateLead link")
	public void clickOnTheCreateLeadLink() throws InterruptedException {
		meth.clickOnTheCreateLeadLink();
	}
	@And("Enter CompanyName as (.*)")
	public void enterCompanyNameAsTCS(String cname) {
		meth.enterCompanyNameAsTCS(cname);
	}
	@And("Enter FirstName as (.*)")
	public void enterFirstNameAsGuru(String fname) {
		meth.enterFirstNameAsGuru(fname);
	}
	@And("Enter LastName as (.*)")
	public void enterLastNameAsShankar(String lname) {
		meth.enterLastNameAsShankar(lname); 
	}
	@And("Click on the CreateLead Button")
	public void clickOnTheCreateLeadButton() {
		meth.clickOnTheCreateLeadButton();
	}
	@Then("verify ViewLead page is displayed")
	public void verifyViewLeadPageIsDisplayed() {
		meth.verifyViewLeadPageIsDisplayed();
	}
	@And ("Close the Browser")
	public void CloseTheBrowser() {
		meth.CloseTheBrowser();
	}
}