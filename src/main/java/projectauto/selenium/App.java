package projectauto.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikabedi\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("manikabedi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		
		String expected_title = "gmail";
		
		if (title.equalsIgnoreCase(expected_title)) {
			System.out.println("Test is successful");
		}
		else {
			System.out.println("Test has failed!!!");
		}
		
	}
}
