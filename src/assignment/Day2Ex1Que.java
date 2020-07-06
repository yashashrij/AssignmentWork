package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Ex1Que {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
		System.out.println("Home page : " + driver.getTitle());
		driver.findElement(By.linkText("Register")).click();
		System.out.println("Register Page title: " + driver.getTitle());
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Yashashri");
		driver.findElement(By.id("LastName")).sendKeys("Jadhav");
		driver.findElement(By.id("Email")).sendKeys("yashuj963@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("pass123@");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123@");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.close();


	}

}
