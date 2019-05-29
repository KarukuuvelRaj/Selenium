package week4.day1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearnWindowHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Contact Us").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(windowHandles);
		String title = driver.switchTo().window(list.get(1)).getTitle();
		//String title = window.getTitle();
		System.out.println("The title of second window is: " + title);
		driver.switchTo().window(list.get(0));
		driver.close();
		driver.switchTo().window(list.get(1));
		driver.close();
	}
}
