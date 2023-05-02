package day7;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class day7_task3Test
{
	WebDriver driver;
	

  @BeforeMethod
  public void setup()
  {
	  WebDriverManager.edgedriver().setup();
	  EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new EdgeDriver(co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
  }
  @Test
  public void test() throws InterruptedException
  {
	  Thread.sleep(3000);
	  WebElement user=driver.findElement(By.name("username"));
	  Thread.sleep(1000);
	  user.sendKeys("Admin");
	  Thread.sleep(1000);
//	  user.sendKeys(Keys.ENTER);
	  WebElement pswd=driver.findElement(By.name("password"));
	  Thread.sleep(1000);
	  pswd.sendKeys("admin123");
	  Thread.sleep(1000);
	  WebElement button=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  Thread.sleep(1000);
	  button.click();
//	  pswd.sendKeys(Keys.ENTER);
	  String actualUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	  String currentUrl=driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl, currentUrl);
	  
  }
  @AfterMethod
  public void teardown()
  {
	  driver.close();
//	  driver.quit(whole browser);
//	  driver.quit();
  }

}
