package week5Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class LeafgroundActionclasss {

public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		/*
		 * Code for Drag and Drop
		 * driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("//div[@id='form:drop']"));
		WebElement target = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(target, source).perform();*/
		
		/*
		 CODE for DRAGGABLE(drag and drop by)
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag,400, 0).perform();*/
		
		
		/*
		CODE FOR SORTABLE
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("(//table[@role='grid'])[1]//th[1]"));
		WebElement target = driver.findElement(By.xpath("(//table[@role='grid'])[1]//th[3]"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(source, target).perform();*/
		
		
		/*CODE for SLIDER
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(slider, 100, 0).perform();*/
		
		
		/*
		CODE for SCROLL DOWN
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement scroll = driver.findElement(By.xpath("//a[text()='Your Ads Privacy Choices']"));
		Actions builder=new Actions(driver);
		builder.scrollToElement(scroll).perform();*/

}
}

/*
Assignment5:(Actions Class)
============
LeafGround Assignment:
https://www.leafground.com/drag.xhtml
https://www.leafground.com/menu.xhtml
https://jqueryui.com/droppable/
https://jqueryui.com/droppable/
*/