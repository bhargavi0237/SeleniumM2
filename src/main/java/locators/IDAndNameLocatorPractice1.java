package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDAndNameLocatorPractice1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement userNameTF = driver.findElement(By.id("email"));
		userNameTF.sendKeys("bddgfgdui");
		
		WebElement passwordTF = driver.findElement(By.id("pass"));
		passwordTF.sendKeys("hbjsnms");
		
		WebElement loginBTN = driver.findElement(By.name("login"));
		loginBTN.click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
