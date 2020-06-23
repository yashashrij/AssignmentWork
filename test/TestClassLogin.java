package com.ibm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestClassLogin {
	@Test
	public void NegativeLog() {
		//System.out.println("hii");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30); 
		driver.get("https://magento.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a")));
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a")).click();
		WebElement usr_inp = driver.findElement(By.id("email"));
		usr_inp.clear();
		usr_inp.sendKeys("yashashrijadhav423@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.clear();
		pwd.sendKeys("welcome");
		driver.findElement(By.id("send2")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div"), "Invalid login or password."));
		System.out.println("as expected");
		driver.quit();

		
		
		
	}
	
	
	

}
