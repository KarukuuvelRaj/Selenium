package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabLeafGround {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//h5[text()='Table']").click();
		WebElement table = driver.findElementByXPath("//table[@cellspacing='0']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Row Count is: "+rows.size());
		/*for (int i = 0; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Column Count is: "+columns.size());
			}*/
		List<WebElement> column = driver.findElementsByXPath("//td");
		System.out.println("Column Count is: "+column.size());
		}
	}
//table.findElements(By.tagName("td"));
