package week5Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Myntra {

public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);//Note

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(men).perform();
		
		driver.findElement(By.xpath("(//a[text()='Jackets'])[1]")).click();
		
		String items = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("Total count is  " + items);
		
		String cat1 = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		String cat2 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		
		if((cat1+cat2)==items) {
			System.out.println("counts matched");
		}
		else {
			System.out.println("counts mismatching");
		}
		
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		
		/*
		 * driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys
		 * ("duke");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[5]"))
		 * .click();
		 */
		driver.findElement(By.className("FilterDirectory-searchInput")).sendKeys("Duke");//Note
		driver.findElement(By.xpath("//label[@class=' common-customCheckbox']//div")).click();//Note

		
		driver.findElement(By.xpath("(//span[contains(@class,'myntraweb-sprite')])[6]")).click();
		List<String> lst=new ArrayList<String>();
		List<WebElement> brand = driver.findElements(By.xpath("//h3[text()='Duke']"));
		for (int i = 0; i < brand.size(); i++) {
			String text = brand.get(i).getText();
			lst.add(text);
		}
		if(lst.contains("Duke")){
			System.out.println("All the Coats are of brand Duke");
			

		}
				
		//driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		String firstprice = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println("Price of first item  " + firstprice );
		driver.findElement(By.xpath("(//img[@draggable='false'])[4]")).click();
		
		Set<String> winhan = driver.getWindowHandles();
		List<String> lst1=new ArrayList<String>(winhan);
		driver.switchTo().window(lst1.get(1));
		
		//Take snapshot
	     File source = driver.getScreenshotAs(OutputType.FILE);
	     //create physical path
	    File dest=new  File("./snap/amazon.png");
	     //copy source and dest
	     FileUtils.copyFile(source, dest);

		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		driver.quit();
}		
}

/*
Assignment 3:
============
Myntra
1) Open https://www.myntra.com/
2) Mouse hover on MeN 
3) Click Jackets 
4) Find the total count of item 
5) Validate the sum of categories count matches
6) Check jackets
7) Click + More option under BRAND
8) Type Duke and click checkbox
9) Close the pop-up x
10) Confirm all the Coats are of brand Duke
    Hint : use List 
11) Sort by Better Discount
12) Find the price of first displayed item
Click on the first product
13) Take a screen shot
14) Click on WishList Now
15) Close Browser
*/