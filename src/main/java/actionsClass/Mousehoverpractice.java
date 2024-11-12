package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoverpractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement homeAndLivingTab = driver.findElement(By.xpath("//a[text()='Home & Living'][1]"));
		Actions action = new Actions(driver);
		action.moveToElement(homeAndLivingTab).perform();
		driver.findElement(By.xpath("//a[text()='Clocks']")).click();
		
		String header = driver.findElement(By.cssSelector("h1.title-title")).getText();
		if(header.equalsIgnoreCase("clocks")) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}