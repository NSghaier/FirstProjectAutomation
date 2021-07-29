package testCases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		System.out.println(" the page is opened successfully ");

		WebElement uploadButton = driver.findElement(By.id("uploadfile_0")) ;
		// uploadButton.sendKeys("C:\\Users\\achre\\OneDrive\\Bureau\\formation selenium\\im1.jpg");

        File path = new File ("src/test/resources/temp/im1.jpg");
		uploadButton.sendKeys(path.getAbsolutePath());

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
        //WebElement message =  driver.findElement(By.xpath("/*[@id=\\"res\\"]/center\");
       // String text = message.getText();
      //  System.out.println("message is:" +text);
		//driver.quit(); 
	}
}
