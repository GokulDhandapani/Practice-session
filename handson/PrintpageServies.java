package handson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintpageServies {

	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	WebElement head = driver.findElement(By.xpath("//ul[@class='servicestwo']//li"));
	String a=head.getText();
	System.out.println(a);
	
	String q = driver.findElement(By.xpath("//ul[@class='servicestwo']//a")).getText();
	System.out.println(q);
	
	List<WebElement> multiple = driver.findElements(By.xpath("//ul[@class='servicestwo']//a"));
for(int i=0;i<multiple.size();i++)
{
	String var=multiple.get(i).getText();
	System.out.println(var);
	}
driver.quit();
	
	}
}
