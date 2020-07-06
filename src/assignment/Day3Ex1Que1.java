package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Ex1Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.get("https://html.com/tables/#Table_Code_Sample_Simple_Table");
		System.out.println("Home page : " + driver.getTitle());
		
	
		List<WebElement> tr = driver.findElements(By.xpath("//*[@id=\"post-382\"]/div/div[4]/table/tbody/tr"));
		System.out.println("The Table Row count is :" + tr.size());
		driver.close();


	}

}
