package frames;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/amazon.png");
		FileUtils.copyFile(temp,dest);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
