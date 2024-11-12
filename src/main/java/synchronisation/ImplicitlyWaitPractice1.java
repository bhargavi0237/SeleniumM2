package synchronisation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitPractice1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.swiggy.com/");
		
		List<WebElement> imgNames = driver.findElements(By.xpath("//h2[text()=\"What's on your mind?\"]/ancestor::div[@class='sc-hZDyAQ dYDtEn']/descendant::div[@class='sc-fTFjTM SfKCv']"));
		Thread.sleep(2000);
		
		for (WebElement imgName : imgNames) {
			System.out.println(imgName.getAttribute(""));
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
