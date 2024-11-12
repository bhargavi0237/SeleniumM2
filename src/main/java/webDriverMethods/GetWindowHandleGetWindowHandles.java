package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleGetWindowHandles {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");	
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.bookmyshow.com/");
		
		System.out.println("Current window address is :" + driver.getWindowHandle());
		
		Set<String> addresses = driver.getWindowHandles();
		for (String s : addresses) {
			System.out.println(s);
		}
		
		driver.quit();	
	}

}
