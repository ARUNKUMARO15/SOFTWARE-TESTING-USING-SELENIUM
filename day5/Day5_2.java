package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_2 
{
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(co);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions actobj=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement source_ele=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dest_ele=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		actobj.clickAndHold(source_ele).release(dest_ele).build().perform();
		
	}

}
