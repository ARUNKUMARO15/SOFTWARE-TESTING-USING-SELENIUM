package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG_class {
  @Test
  public void OpenGoogle() 
  {
	  WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
  }
}
