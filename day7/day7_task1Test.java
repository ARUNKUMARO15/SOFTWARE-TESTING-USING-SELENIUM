package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7_task1Test {
  @Test
  public void mavenconfiguration() throws InterruptedException 
  {
	  	WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		Thread.sleep(1000);
		String title=driver.getTitle();
//		System.out.println(title);
		//String expectedtitle="Guest Registration Form – User Registration";
		Assert.assertEquals(title,"Guest Registration Form – User Registration");
  }
}
