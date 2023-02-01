package week5Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

private static WebElement findElement;

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mousehover = driver.findElement(By.xpath("//a[text()='brands']"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(mousehover).perform();
		
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris")) {
			System.out.println(title);
		}
		
		//driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		WebElement sort = driver.findElement(By.xpath("//span[@class='sort-name']"));
		driver.executeScript("arguments[0].click();",sort );
		
		//driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		WebElement click1 = driver.findElement(By.xpath("//span[text()='customer top rated']"));
		driver.executeScript("arguments[0].click();",click1 );
		
		//code to click category
		//driver.findElement(By.xpath("(//div[@class='filter-open css-1kwl9pj'])[1]")).click();
		WebElement click2 = driver.findElement(By.xpath("(//div[@class='filter-open css-1kwl9pj'])[1]"));
		driver.executeScript("arguments[0].click();",click2 );
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Hair']")).click();
		WebElement click3 = driver.findElement(By.xpath("//span[text()='Hair']"));
		driver.executeScript("arguments[0].click();",click3 );
		
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		//WebElement click4 = driver.findElement(By.xpath("//span[text()='Hair Care']"));
		//driver.executeScript("arguments[0].click();",click4 );
		
		
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		//WebElement click5 = driver.findElement(By.xpath("//span[text()='Shampoo']"));
		//driver.executeScript("arguments[0].click();",click5 );
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		//WebElement click6 = driver.findElement(By.xpath("//span[text()='Concern']"));
		//driver.executeScript("arguments[0].click();",click6 );
		
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		//WebElement click7 = driver.findElement(By.xpath("//span[text()='Color Protection']"));
		//driver.executeScript("arguments[0].click();",click7 );
		
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		//WebElement click8 = driver.findElement(By.xpath("//div[@class='css-xrzmfa']"));
		//driver.executeScript("arguments[0].click();",click8 );
		
		Set<String> winhan = driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(winhan);
		driver.switchTo().window(lst.get(1));
		
		driver.findElement(By.xpath("(//span[contains(@class,'css-ieawrs')])[3]")).click();
		//WebElement click9 = driver.findElement(By.xpath("(//span[contains(@class,'css-ieawrs')])[3]"));
		//driver.executeScript("arguments[0].click();",click9 );
		
		//String price = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
		//System.out.println("MRP of the product is  " + price);
		
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		//WebElement click10 = driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]"));
		//driver.executeScript("arguments[0].click();",click10 );
		
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		//WebElement click11 = driver.findElement(By.xpath("//span[@class='cart-count']"));
		//driver.executeScript("arguments[0].click();",click11 );
		
		String Grandtotal = driver.findElement(By.xpath("//span[text()='Grand Total']")).getText();
		System.out.println("Grand Total is  "  + Grandtotal);
		
		//driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		WebElement click12 = driver.findElement(By.xpath("//span[text()='Proceed']"));
		driver.executeScript("arguments[0].click();",click12 );
		
		//driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]")).click();
		WebElement click13 = driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]"));
		driver.executeScript("arguments[0].click();",click13 );
		
		String text1 = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
		
		if(Grandtotal==text1) {
			System.out.println("Total is same");
		}
		else {
			System.out.println("Total is different");
		}
		
		driver.quit();
}
}


//WebElement opper = driver.findElement(By.xpath("//span[text()='Opportunities']"));
//driver.executeScript("arguments[0].click();",opper );
/*
Assignment 1:Nykaa
===================
1) Go to https://www.nykaa.com/
2) Mouseover on Brands and Search L'Oreal Paris
3) Click L'Oreal Paris
4) Check the title contains L'Oreal Paris(Hint-GetTitle)
5) Click sort By and select customer top rated
6) Click Category and click Hair->Click haircare->Shampoo
7) Click->Concern->Color Protection
8)check whether the Filter is applied with Shampoo
9) Click on L'Oreal Paris Colour Protect Shampoo
10) GO to the new window and select size as 175ml
11) Print the MRP of the product
12) Click on ADD to BAG
13) Go to Shopping Bag 
14) Print the Grand Total amount
15) Click Proceed
16) Click on Continue as Guest
17) Check if this grand total is the same in step 14
18) Close all windows
*/