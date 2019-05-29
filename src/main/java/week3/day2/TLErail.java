package week3.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TLErail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/trains-between-stations/chennai-central-MAS/thiruvarur-jn-TVR");
		driver.findElementById("chkSelectDateOnly").click();
		List<WebElement> beforSorting = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[1]");
		List<Integer> ls = new ArrayList<Integer>();
		for (WebElement eachTrain : beforSorting) {
			ls.add(Integer.parseInt(eachTrain.getText()));
		}
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println("Before Sorting: "+ls);
		driver.findElementByXPath("//a[text()='Train']").click();
		Thread.sleep(3000);
		List<WebElement> sortedTrain = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[1]");
		List<Integer> afterSorted = new ArrayList<Integer>();
		for (WebElement eachSortedTrain : sortedTrain) {
			afterSorted.add(Integer.parseInt(eachSortedTrain.getText()));
		}
		System.out.println("After Sorting: "+afterSorted);
		for (int i = 0; i < ls.size(); i++) {
			if (ls.get(i).equals(afterSorted.get(i))) {
				System.out.println(ls.get(i)+"matched the value with : "+afterSorted.get(i) );	
			}
		}
	}
}

