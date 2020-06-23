package com.ibm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MedicalApp {

	public static void main(String[] args) throws InterruptedException {

		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.openemr.io/a/openemr");
		
		
		WebElement usr_inp = driver.findElement(By.id("authUser"));
		usr_inp.sendKeys("admin");
		
		WebElement paswd = driver.findElement(By.id("clearPass"));
		paswd.sendKeys("pass");
		
		driver.findElement(By.id("clearPass")).submit();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Patient/Client']"))).perform();
		
		driver.findElement(By.xpath("//div[text()='New/Search']")).click();
		Thread.sleep(4000);
		
		driver.switchTo().frame("pat");
		Select sel = new Select(driver.findElement(By.id("form_title")));
		sel.selectByValue("Mr.");
		
		driver.findElement(By.id("form_fname")).sendKeys("Yashashri");
		driver.findElement(By.id("form_lname")).sendKeys("jadhav");
		
		driver.findElement(By.id("form_DOB")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("xdsoft_today")).click();
		
		Select gender = new Select(driver.findElement(By.id("form_sex")));
		gender.selectByValue("Female");
		driver.findElement(By.id("create")).click();
		
		//driver.switchTo().frame("");
		
		//driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		


		

		
		
		
		
		
		
	}

}
