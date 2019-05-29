package baseUtil;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
@Listeners(ExtentITestListenerAdapter.class)
public class BaseClass {
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String url, String usrname, String Password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys(usrname);
		driver.findElementById("password").sendKeys(Password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
