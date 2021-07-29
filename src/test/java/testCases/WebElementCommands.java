package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
     	WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		driver.manage().window().maximize();

		// Send user name
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement element = driver.findElement(By.id("txtUsername"));
		String attValue = element.getAttribute("id");
		System.out.println("*** The id attribute is: " + attValue);
		element.clear();

		// Send password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement element2 = driver.findElement(By.id("txtPassword"));

		Dimension dimensions = element2.getSize();
		System.out.println("Hight: " + dimensions.height + "width:" + dimensions.width);
		element2.clear();

		// Location Element with Point class
		WebElement element3 = driver.findElement(By.id("txtPassword"));
		Point point = element3.getLocation();
		System.out.println("X cordinate:" + point.x + "Y cordinate:" + point.y);

		// Verify element is displayed True/False
		WebElement element4 = driver.findElement(By.id("btnLogin"));
		boolean statut = element4.isDisplayed();
		System.out.println("status of button login is:" + statut);// Check visibility of button btnlogin

		// Verify element is displayed True /False
		WebElement element5 = driver.findElement(By.id("btnLogin"));
		boolean status1 = element5.isEnabled();
		System.out.println("Status of button is :" + status1);

		// Verify element is exist True /False
		List<WebElement> element6 = driver.findElements(By.id("btnLogin"));
		if (element6.size() != 0) {
			System.out.println(" The element exist ");

		} else {
			System.out.println(" the element doesn't exist ");
		}

		driver.close();
	}
}
