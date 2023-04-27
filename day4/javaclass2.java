package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaclass2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys("VIRAT");	
		WebElement lname=driver.findElement(By.id("input-lastname"));
		lname.sendKeys("KOHLI");
		WebElement email=driver.findElement(By.id("input-email"));
		email.sendKeys("kingkohli18@cricket.com");
		WebElement pswd=driver.findElement(By.id("input-password"));
		pswd.sendKeys("Anushka");
		WebElement subs=driver.findElement(By.className("col-sm-10"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(20000);
		WebElement yesbutton=driver.findElement(By.id("input-newsletter-yes"));
		yesbutton.click();
	}

}
