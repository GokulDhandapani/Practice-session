package handson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropby {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://letcode.in/draggable");
//		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(10,TimeUnit)
//		driver.switchTo().frame(0);
//		WebElement ele = driver.findElement(By.id("sample-box"));
//		Actions drag = new Actions(driver);
//		int x = ele.getLocation().getX();
//		int y = ele.getLocation().getY();
//		drag.dragAndDropBy(ele,x+ 30,y+45).perform();
		
		
// example 2		
		
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit)
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("draggable"));
		Actions drag = new Actions(driver);
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		drag.dragAndDropBy(ele,x+100 ,y+0).perform();
		driver.quit();
		
	}

}
