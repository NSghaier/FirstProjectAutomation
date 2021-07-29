package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClikDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		// Instantiate class action
		Actions actions = new Actions(driver);
		WebElement btnElement = driver.findElement(By.id("rightClickBtn"));

		actions.contextClick(btnElement).perform();
		System.out.println("Execution complete");

		String message = driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertEquals("You have done a right click", message);
		System.out.println("Execution complete");

		driver.close();

	}

}
