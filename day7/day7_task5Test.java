package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7_task5Test
{
	WebDriver driver;
  @Test(groups= {"SmokeTest"})
  public void testcase1() throws InterruptedException
  {
	  WebDriverManager.edgedriver().setup();
	  EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new EdgeDriver(co);
		driver.get("https://www.godaddy.com");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Thread.sleep(1000);
		String expectedtitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		Assert.assertEquals(title, expectedtitle);
		Thread.sleep(1000);
		Thread.sleep(1000);
		String url=driver.getTitle();
		Thread.sleep(1000);
		String expectedurl="https://www.google.com";
		Assert.assertEquals(title, expectedtitle);
		Thread.sleep(1000);
		driver.close();
  }
  @Test(groups= {"Regression Test"})
  public void testcase2() throws InterruptedException
  {
	  WebDriverManager.edgedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.godaddy.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
		
  }
  @Test(groups= {"Regression Test"})
  public void testcase3() throws InterruptedException
  {
	  WebDriverManager.edgedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.godaddy.com/");
		Thread.sleep(1000);
		
  }
 }
