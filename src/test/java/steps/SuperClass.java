package steps;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
public class SuperClass {
	static ChromeDriver driver;
	public void openTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");  
		driver=new ChromeDriver();
	}
	public void maximiseTheBrowser() {
		driver.manage().window().maximize();
	}
	public void setTheTimeout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void enterTheURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	public void enterTheUsernameAsDemoSalesManager(String uname) {
		driver.findElementById("username").sendKeys(uname);
	}
	public void enterThePasswordAsCrmsfa(String password) {
		driver.findElementById("password").sendKeys(password);
	}
	public void clickOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	public void verifyHomePageIsDisplayed() {
		String text = driver.findElementByXPath("//div[@id='form']/h2").getText();
		if(text.contains("Welcome ")) {
			System.out.println("Homme Page is displayed");
		}
	}
	public void clickOnTheCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	public void clickOnTheLeadsLink() {
		driver.findElementByLinkText("Leads").click();
	}
	public void enterCompanyNameAsTCS(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}
	public void enterFirstNameAsGuru(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}
	public void enterLastNameAsShankar(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname); 
	}
	public void clickOnTheCreateLeadButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	public void verifyViewLeadPageIsDisplayed() {
		String text1 = driver.findElementByXPath("//div[text()='View Lead']").getText();
		if(text1.equals("View Lead")) {
			System.out.println("Create Lea"
					+ "d is sucessful");
		}
	}
	public void CloseTheBrowser() {
		driver.close();
	}
	public void clickOnTheCreateLeadLink() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByLinkText("Create Lead").click();
	}
	public void SelectTheLeadToDelete() {
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
	}
	public void ClickOnTheDeleteButton() {
		driver.findElementByLinkText("Delete").click();
	}
	public void VerifyMyLeadsPageIsDisplayed() throws InterruptedException {
		Thread.sleep(3000);
		String text = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		if(text.equals("My Leads")) {
			System.out.println("Delete Lead is succesful");
		}
	}
}
