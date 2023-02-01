package week5Assignments;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		System.out.println("Row count " + row.size());
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
		System.out.println("Column count " + column.size());
	}
}

/*
Assignment2:
============
1. Launch the URL https://html.com/tags/table/
2. Get the count of number of rows
3. Get the count of number of columns

*/