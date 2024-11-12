package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		Actions action = new Actions (driver);
		action.clickAndHold(block1).moveToElement(block4).release().build().perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
