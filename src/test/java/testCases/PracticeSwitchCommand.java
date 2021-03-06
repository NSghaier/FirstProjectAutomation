package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

		// Switching the frame by id
		driver.switchTo().frame("a077aa5e");
		System.out.println("***We are switch to the iframe***");

		driver.findElement(By.xpath("html/body/a/img")).click();
		System.out.println("***We are done***");

		driver.close();
	}

}
