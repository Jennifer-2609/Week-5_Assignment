package week5Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		String price1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
		System.out.println("Price of First Product: " + price1);
		
		//String rating = driver.findElement(By.xpath("(//span[@class='a-size-base'])[1]")).getText();
		//System.out.println("First Product Rating: " + rating);
		
		WebElement mousehover = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-star-small a-star-small-4 aok-align-bottom'])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mousehover).perform();
		
		Thread.sleep(3000);
		//String rating = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold']")).getText();
		//System.out.println("First Product Rating: " + rating);
		
		//String fivestar = driver.findElement(By.xpath("(//div[@class='a-meter'])[1]")).getText();
		//System.out.println("% of 5 star rating:  " + fivestar);
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(windowHandles );
		driver.switchTo().window(lst.get(1));
		
		//screenshot
		//File source = driver.getScreenshotAs(OutputType.FILE);
		// File dest=new  File("./snap/amazon1.png");
		// FileUtils.copyFile(source, dest);
		 
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		Thread.sleep(3000);
		WebElement click1 = driver.findElement(By.xpath("//span[text()='Cart']"));
		driver.executeScript("arguments[0].click();",click1 );
		
		String price2 = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium')])[3]")).getText();
		System.out.println("Cart Grand Total: " + price2);
		
		if(price1==price2) {
			System.out.println("Both Price are same");
		}
		else {
			System.out.println("Prices differ");
		}
		
		
	}
}

/*
Assignment:2
===========
Amazon:
1.Load the uRL https://www.amazon.in/
2.search as oneplus 9 pro 
3.Get the price of the first product
4. Print the number of customer ratings for the first displayed product
5. Mouse Hover on the stars
6. Get the percentage of ratings for the 5 star.
7. Click the first text link of the first image
8. Take a screen shot of the product displayed
9. Click 'Add to Cart' button
10. Get the cart subtotal and verify if it is correct.
*/