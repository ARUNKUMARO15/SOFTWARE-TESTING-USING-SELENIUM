package day7;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class day7_task4Test 
{
	WebDriver driver;
  @Test
  public void Login() throws InterruptedException
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
  @BeforeTest
  public void beforeMethod()
  {
	  WebDriverManager.edgedriver().setup();
	  EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new EdgeDriver(co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
  }
  @Test(dependsOnMethods= {"Login"})
  public void Logout() throws InterruptedException
  {
	  Thread.sleep(1000);
	  WebElement user=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
	  user.click();
	  WebElement logout=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
	  Thread.sleep(1000);
	  logout.click();
//	  String actualUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
//	  String currentUrl=driver.getCurrentUrl();
//	  Assert.assertEquals(actualUrl, currentUrl);
	  driver.close();
  }

}
