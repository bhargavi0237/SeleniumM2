package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateRefreshFetchTitleURL {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("", "");
		System.out.println(js.executeScript(""));
		System.out.println(js.executeScript(""));
		Thread.sleep(2000);
		js.executeScript("");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
