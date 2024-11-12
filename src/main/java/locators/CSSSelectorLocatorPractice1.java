package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorLocatorPractice1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("abcde@1234");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("123rtyu");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
