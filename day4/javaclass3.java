package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaclass3
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("VIJAY");
		driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("vijay@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Rohit");
		driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("Rohit@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
	}
}