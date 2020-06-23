package com.ibm.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Netbanking {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebDriverWait wait1 = new WebDriverWait(driver,30); 

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//String parent = driver.getWindowHandle();
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/p/a[1]")));
		
		
		driver.switchTo().frame("footer");  // switching to frame on webpage
		driver.findElement(By.partialLinkText("Terms and Conditions")).click();
		driver.switchTo().defaultContent();   //coming back to default page
		
		Set<String> winid = driver.getWindowHandles();   // capture window id and store

		driver.switchTo().window((String)winid.toArray()[1]);
		driver.findElement(By.linkText("HDFC Life")).click();
		driver.close();
		
		winid = driver.getWindowHandles();
		
		//Thread.sleep(2000);
		
		driver.switchTo().window((String) winid.toArray()[1]);
		String url = driver.getTitle();
		System.out.println(url);
		//driver.quit();
		
		
	}

}
