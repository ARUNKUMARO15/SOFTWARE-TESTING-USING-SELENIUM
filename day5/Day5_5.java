package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Apple");
		Thread.sleep(1000);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		System.out.print(driver.getWindowHandle());
		System.out.print(driver.getTitle());
		System.out.println();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
		System.out.print(driver.getWindowHandle());
		System.out.print(driver.getTitle());
		System.out.println();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Cucumber");
		Thread.sleep(1000);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		System.out.print(driver.getWindowHandle());
		System.out.print(driver.getTitle());
	}

}
