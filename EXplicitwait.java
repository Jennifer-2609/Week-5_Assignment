package week5Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EXplicitwait {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//code for "Wait for Visibility (1 - 10 Sec)"
		WebElement visible = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
		visible.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(visible));
		
		
		//code for "Wait for Invisibility (1 - 10 Sec)"
		WebElement invisible = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
		invisible.click();
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.invisibilityOf(invisible));
		
		//code for "Wait for Clickability"
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		
		//Code for "Wait for Text Change (1 - 10 Sec)"
		WebElement textchange = driver.findElement(By.xpath("(//span[text()='Click'])[3]"));
		textchange.click();
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.visibilityOf(textchange));
		String text = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).getText();
		if(text.contains("Did you notice")) {
			System.out.println(text);
		}
		
		
	}
}

/*
Assignment 4:
=============
Explicitly wait Assignment:
https://www.leafground.com/waits.xhtml
Based on title do all the wait Assignment.
*/