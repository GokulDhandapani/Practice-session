/**
 * 
 */
package handson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 */
public class myntra {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException{
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.Myntra.com");
//driver.findElement(By.xpath("//h3 [text()=\"Myntra: Online Shopping for Women, Men, Kids Fashion ...\"]")).click();

//driver.findElement(By.xpath("//a[text()='Men']")).click();

WebElement sportsShoes= driver.findElement(By.xpath("//a[text()='Men']"));
Actions new1 = new Actions(driver);
new1.pause(20).moveToElement(sportsShoes).perform();

driver.findElement(By.xpath("//a[text()='Sports Shoes']")).click();

	}

}

