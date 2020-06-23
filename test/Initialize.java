package com.ibm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Initialize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 							// webdriver instance
		driver.manage().window().maximize(); 							// maximizing browser window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30); 
		
		//driver.quit();
		
		driver.get("https://magento.com");		//navigating to webpage
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div"))); //waiting for element to be load
		
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();  //locating user icon and clicking on it
		
		WebElement usr_inp = driver.findElement(By.id("email")); 		//passing input
		usr_inp.clear();
		usr_inp.sendKeys("yashashrijadhav423@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		usr_inp.clear();
		pwd.sendKeys("welcome");
		
		driver.findElement(By.id("send2")).click();  // login 
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div"), "Invalid login or password."));
		
		System.out.println("as expected");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("register")).click();		//register btn
		
		WebElement fst_name = driver.findElement(By.id("firstname"));
		fst_name.sendKeys("Yash");
		
		WebElement lst_name = driver.findElement(By.id("lastname"));
		lst_name.sendKeys("Jadhav");

		WebElement email_inp = driver.findElement(By.id("email_address"));
		email_inp.sendKeys("yashashrijadhav423@gmail.com");
		
		Select primary = new Select(driver.findElement(By.id("company_type")));		//dropdown selection
		primary.selectByValue("selling");
		
		Select role = new Select(driver.findElement(By.id("individual_role")));
		role.selectByVisibleText("Technical/developer");
		
		Select cntry = new Select(driver.findElement(By.id("country")));
		cntry.selectByIndex(30);
		
		WebElement pass_inp = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass_inp.sendKeys("Welcome@123");
		
		WebElement pass_cnf = driver.findElement(By.id("password-confirmation"));
		pass_cnf.sendKeys("Welcome@123");
		
		if(!driver.findElement(By.id("agree_terms")).isSelected());   //checking whether checkbox is selected or not
		{
			driver.findElement(By.id("agree_terms")).click();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
