package week5Assignments;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		List<WebElement> securityname = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr//td[3]"));
		System.out.println("list size" + securityname.size());
		for (int i = 0; i < securityname.size(); i++) {
			String name= securityname.get(i).getText();
			System.out.println(name);
		}
		Set<WebElement> st=new LinkedHashSet<WebElement>(securityname);
	
		System.out.println("set size" + st.size());
		if(securityname.size()==st.size()) {
			System.out.println("No Duplicates");
	}
		else {
			System.out.println("Duplicates Present");
		}
}
}
/*
Assignment1:
============
1. Launch the URL https://www.chittorgarh.com/
2. Click on stock market
3. Click on NSE bulk Deals
4. Get all the Security names
5. Ensure whether there are duplicate Security names
*/