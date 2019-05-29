package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearListAndSet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("TVR",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(2000);
		List<WebElement> table = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[1]");
		Set<String> Trainname=new TreeSet<String>();
		
		List<Integer> Listsort = new ArrayList<Integer>();
		//Listsort.addAll(Trainname);
		for (int i = 0; i < table.size(); i++) {
			System.out.println((table.get(i).getText()));
			Trainname.add((table.get(i).getText()));
			
		}
		if (table.size()==Trainname.size()) {
			System.out.println("There is no duplicate");
		}else
			System.out.println("Duplicate is there");
	}

}
