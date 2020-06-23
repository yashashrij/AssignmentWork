package com.ibm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,50); 
		
		driver.get("http://realty-real-estatem1.upskills.in");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='responsive']/li[@class=\"right-side-menu-item\"]")));
		driver.findElement(By.xpath("//ul[@id='responsive']/li[@class=\"right-side-menu-item\"]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("email")).sendKeys("yashashrijadhav143@gmail.com");
		driver.findElement(By.id("first-name")).sendKeys("Yash");
		driver.findElement(By.id("last-name")).sendKeys("jadh");
		driver.findElement(By.className("register-button")).click();
		
		//Thread.sleep(3000);
		
		//String text = driver.findElement(By.xpath("//div[@class='notification success closeable']")).getText();
		//System.out.println(text);
		


		
		
		
		
	}

}
