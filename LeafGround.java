package week5Assignments;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		List<WebElement> row = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
		//List<WebElement> Name = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr//td[1]"));
		for (int i = 1; i <row.size(); i++) {
			String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]//td[1]")).getText();
			System.out.println(text);
		}
		
			
}
}

/*
Assignment4:
============
https://leafground.com/table.xhtml
*/