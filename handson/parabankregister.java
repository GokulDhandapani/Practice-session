package handson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabankregister {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open link
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		//register
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		//name
		driver.findElement(By.id("customer.firstName")).sendKeys("Gokulraj D");
		//last name
		driver.findElement(By.name("customer.lastName")).sendKeys("Dhandapani");
		//address
		driver.findElement(By.id("customer.address.street")).sendKeys("dfghj");
		//city
		driver.findElement(By.name("customer.address.city")).sendKeys("Chennai");
		//state
		driver.findElement(By.id("customer.address.state")).sendKeys("Tamilnadu");
		//zip code
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("631502");
		//phone
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("9566957665");
		//ssn
		driver.findElement(By.id("customer.ssn")).sendKeys("Customer");
		//username
		driver.findElement(By.id("customer.username")).sendKeys("Gokulraj");
		//password
		driver.findElement(By.id("customer.password")).sendKeys("gokul123");
		//confirm password
		driver.findElement(By.name("repeatedPassword")).sendKeys("gokul123");
		//register
		//*[@id="customerForm"]/table/tbody/tr[13]/td[2]/input
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
	}

}
