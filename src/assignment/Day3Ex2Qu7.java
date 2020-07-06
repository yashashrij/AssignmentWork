package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3Ex2Qu7 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver(); 							
		driver.manage().window().maximize(); 							
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.xpath("//input[@name=\"user_login\"]")).sendKeys("Admin");
		Thread.sleep(3000);
		WebElement dblclk = driver.findElement(By.xpath("//input[@name=\"user_login\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(dblclk).doubleClick().perform();
		driver.findElement(By.xpath("//input[@name=\"user_login\"]")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		driver.close();

	
	}

}
