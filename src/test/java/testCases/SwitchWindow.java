package testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {

		// Create a new instance of the chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		System.out.println(" the page is opened successfully ");

		// Store and print the name of the first window
		String handle = driver.getWindowHandle();
		System.out.println("first window"  +handle);

		driver.findElement(By.id("messageWindowButton")).click();

		// Store and print the name of all the windows opened
		Set handles = driver.getWindowHandles();
		System.out.println("return all open window " +handles);

		// enhanced loop pass window handle to other window
//		for (String handle1 : driver.getWindowHandles()) {
//			System.out.println(handle1);
//			driver.switchTo().window(handle1);
//		}

		for (String handle1 : driver.getWindowHandles()) {
			System.out.println(handle1 + " / " + driver.getTitle());
			driver.switchTo().window(handle1);
			}
	
	}
}