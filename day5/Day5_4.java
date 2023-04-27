package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		WebElement source=driver.findElement(By.id("source"));
		WebElement desti=driver.findElement(By.id("destination"));
		source.sendKeys("Coimbatore");
		Thread.sleep(1000);
		source.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		desti.sendKeys("Bangalore");
		Thread.sleep(1000);
		desti.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement date=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		date.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','06-06-2023')",date);
		Thread.sleep(1000);
		WebElement btn=driver.findElement(By.id("seo_search_btn"));
		Thread.sleep(1000);
		btn.click();
	}
}
