package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("k.velu93@gmail.com");
		driver.findElementById("pass").sendKeys("rajfb@1993");
		driver.findElementByXPath("//input[@value='Log In']").click();
		driver.findElementByXPath("(//input[@type='text'] )[1]").sendKeys("TestLeaf");
		driver.findElementByXPath("(//button[@type='submit'])[1]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//div[text()='Places'])[1]").click();
		String text = driver.findElementByLinkText("TestLeaf").getText();
		if(text.contains("TestLeaf")) {
			System.out.println("Under Places TestLeaf is displayed");
		}else {
			System.out.println("TestLeaf is not displayed");
		}
		Thread.sleep(5000);
		String text2 = driver.findElementByXPath("(//button[@type='submit'])[3]").getText();
		System.out.println(text2);
//		Thread.sleep(10000);
		if(text2.equals("Like")) {
			driver.findElementByXPath("(//button[@type='submit'])[3]").click();
		}else if(text2.equals("Liked")){
			System.out.println("It is already liked");
		}
		
		driver.findElementByLinkText("TestLeaf").click();
		String title = driver.getTitle();
		if(title.contains("TestLeaf")) {
			System.out.println("Title contains TestLeaf");
		}else {
			System.out.println("Title doesn't contains TestLeaf");
		}
		String text3 = driver.findElementByXPath("//div[text()[contains(.,'people')]]").getText();
		String substring = text3.substring(0, 5);
		System.out.println("People liked this page: "+substring);
		driver.quit();
	}

}
