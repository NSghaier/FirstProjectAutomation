package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		driver.manage().window().maximize();

		String titlePage = driver.getTitle();
		int titleLength = titlePage.length();

		System.out.println("Title of the page is: " + titlePage);
		System.out.println("Length title of the page is : " + titleLength);

		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			System.out.println("Verifcation successfull - the correct url is opened");
		} else {
			System.out.println("Verifcation failed - an incorrect url is opened");
		}

		System.out.println("Actual url is: " + actualUrl);
		System.out.println("Expected url is : " + url);

		String sourcePage = driver.getPageSource();
		int pageSourceLength = sourcePage.length();
		System.out.println("Length of source page is : " + pageSourceLength);

		driver.quit();
	}

}
