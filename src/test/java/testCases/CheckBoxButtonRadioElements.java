package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxButtonRadioElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String url = "https://demoqa.com/automation-practice-form";
		driver.get(url);
		driver.manage().window().maximize();

		// instantiate select button radio
		/*
		 * Select radio = new
		 * Select(driver.findElement(By.xpath("//*[@id=\"gender-radio-1\"]")));
		 * 
		 * radio.selectByValue("Male");
		 */

		WebElement hobbiesSport = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		hobbiesSport.click();

		// Scroll down
		for (int second = 0;; second++) {
			if (second >= 60) {
				break;
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(40,0)", "");
		}

		// Refresh application
		Thread.sleep(2000);
		driver.navigate().refresh();
		// Back
		Thread.sleep(2000);
		driver.navigate().back();

		// Forward
		driver.navigate().forward();

	}

}
