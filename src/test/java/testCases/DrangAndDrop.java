package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrangAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/droppable/");

		driver.findElement(By.id("draggable")).click();
		Actions action = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		action.dragAndDrop(from, to).perform();

		// verify text is changed to dropped
		String textTo = driver.findElement(By.id("droppable")).getText();
		if (textTo.equals("Dropped!")) {
			System.out.println("pass: source is dropped to target expected");
		} else {
			System.out.println("pass: source is not dropped to target expected");
		}
		driver.get("https://translate.google.com/?hl=en");
		
		driver.quit();
		
	}

}
