package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParabankLogin {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Gokulraj");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gokul123");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();


	}

}

