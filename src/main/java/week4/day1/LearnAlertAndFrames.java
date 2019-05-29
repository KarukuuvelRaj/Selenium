package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertAndFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert myAlert = driver.switchTo().alert();
		myAlert.sendKeys("Raj");
		myAlert.accept();
		String text = driver.findElementByXPath("//p[@id='demo']").getText();
		System.out.println("Text is: "+text);
		if (text.contains("Raj")) {
			System.out.println("Success");
		}else {
			System.out.println("Failed");
		}
		driver.switchTo().defaultContent();
		driver.close();
	}
}
