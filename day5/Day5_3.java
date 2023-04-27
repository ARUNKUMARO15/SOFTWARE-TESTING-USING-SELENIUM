package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(co);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement input=driver.findElement(By.name("cusid"));
		input.sendKeys("401");
		Thread.sleep(1000);
		WebElement submitbutton=driver.findElement(By.name("submit"));
		submitbutton.click();
		Thread.sleep(1000);
		Alert call1=driver.switchTo().alert();
		call1.dismiss();
		Thread.sleep(1000);
		input.clear();
		Thread.sleep(1000);
		input.sendKeys("402");
		Thread.sleep(1000);
		submitbutton.click();
		Thread.sleep(1000);
		Alert call2=driver.switchTo().alert();
		Thread.sleep(1000);
		call2.accept();
		Alert call3=driver.switchTo().alert();
		String msg=call3.getText();
		call3.accept();
		System.out.println(msg);
	}

}
