package day9;

import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class day9_Task3 {
  WebDriver driver;
  @Test
  public void method()
  {
	  System.out.println("Shows Browser");
  }
 @Parameters({"browser"})
  @BeforeMethod()
  public void beforeMethod(String browser1) throws InterruptedException
  {
	  if(browser1.equals("edge"))
	  {
		  WebDriverManager.edgedriver().setup();
		  EdgeOptions co=new EdgeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver(co);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(1000);
	  }
	  else if(browser1.equals("chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(1000);
	  }
  }

}
