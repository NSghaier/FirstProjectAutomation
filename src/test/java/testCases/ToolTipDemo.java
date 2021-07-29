package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demoqa.com/tool-tips/");
		driver.manage().window().maximize();

		// tooltip
		WebElement text = driver.findElement(By.id("toolTipButton"));
		String toolTipText = text.getText();
		if (toolTipText.equalsIgnoreCase("Hover me to see")) {
			System.out.println("Pass : ToolTyp matching expected value");
		} else {
			System.out.println("Pass : ToolTyp not matching expected value");

		}

		WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));
		String textPlaceHolder = placeHolder.getAttribute("placeholder");
		System.out.println("PlaceHolder is : " + textPlaceHolder);

	}

}
