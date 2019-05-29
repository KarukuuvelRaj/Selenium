package week4.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("(//div[@class='items'])[2]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		Date date = new Date();
		DateFormat date1 = new SimpleDateFormat("dd");
		String format = date1.format(date);
		int tomorrow=Integer.parseInt(format)+1;
		//System.out.println(tomorrow);
		driver.findElementByXPath("//div[@class='days']/div[contains(text(),'"+tomorrow+"')]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.findElementByXPath("//button[text()='Done']").click();
		Thread.sleep(3000);
		List<WebElement> listOfCars = driver.findElementsByXPath("//div[@class='car-listing']");
		System.out.println("Number of cars listed: "+listOfCars.size());
		List<WebElement> priceList = driver.findElementsByXPath("//div[@class='price']");
		List<Integer> integer = new ArrayList<Integer>();
		for (WebElement integer2 : priceList) {
			String priceValue = integer2.getText();
			integer.add(Integer.parseInt(priceValue.replaceAll("\\D", "")));
		}
		Integer max = Collections.max(integer);
		System.out.println("Highest Value is: "+max);
		String highestPrice = driver.findElementByXPath("//div[contains(text(),'"+max+"')]/preceding::h3[1]").getText();	
		System.out.println("Highest Price Car Name is: "+highestPrice);
		driver.quit();
	}							
}
