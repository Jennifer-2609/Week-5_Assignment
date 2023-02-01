package week5Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teble2 {

	private static String name;

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> library = driver.findElements(By.xpath("//div[@class='render']//tr//td[1]"));
		for (int i = 0; i < library.size(); i++) {
			String name=library.get(i).getText();
		}
		List<WebElement> marketshare = driver.findElements(By.xpath("//div[@class='render']//tr[1]//td"));
		for (int i = 0; i < marketshare.size(); i++) {
			String mar=marketshare.get(i).getText();
			//System.out.println(mar);
		}
		
		List<WebElement> absoluteusage = driver.findElements(By.xpath("//div[@class='render']//tr[2]//td"));
		for (int i = 0; i < absoluteusage.size(); i++) {
			String abso = absoluteusage.get(i).getText();
			//System.out.println(abso);
		}
		
	}
}
/*
 Assignment3:
============
1. Launch the URL https://html.com/tags/table/
2. You have to print the respective values based on given Library
(hint: if the library was absolute usage, then print all its value)
*/