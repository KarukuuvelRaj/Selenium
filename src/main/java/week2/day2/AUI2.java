package week2.day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AUI2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, drag.getLocation().getX() + 50, 
				drag.getLocation().getY()+ 50).perform();
		}

}
