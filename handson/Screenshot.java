package handson;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
 driver.get("http://agriexpo.live/");
 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 
 File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
 File destination = new File("./screenshot/img.png");
 org.openqa.selenium.io.FileHandler.copy(screenshotAs, destination);
 
 
 WebElement parti = driver.findElement(By.xpath("//a[@id='get_in_touch']"));
 File screenshot1 = parti.getScreenshotAs(OutputType.FILE);
 File destination1 = new File("./screenshot/img1.png");
 org.openqa.selenium.io.FileHandler.copy(screenshot1, destination1);
 
 WebElement para = driver.findElement(By.linkText("Our mission is to revolutionize the agriculture industry by offering cutting-edge technologies and best practices in agriculture, horticulture, dairy farming, and food processing."));
 File screenshot2 = para.getScreenshotAs(OutputType.FILE);
 File destination2 = new File("./screenshot/img2.png");
 org.openqa.selenium.io.FileHandler.copy(screenshot2, destination2);
 
 
 
 driver.quit();
 

	}

}
