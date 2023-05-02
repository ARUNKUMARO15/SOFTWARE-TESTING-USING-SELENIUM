package day7;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day7_task2Test
{
//	calculatorclass
	int a,b,c;
	@BeforeSuite
	void getinput()
	{
		System.out.println("Enter the values ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
//		a=54;
//		b=9;
	}
  @Test(priority=4)
  public void add()
  {
	  c=a+b;
	  Assert.assertEquals(c,63);
  }
  @Test(priority=2)
  public void subtract()
  {
	  c=a-b;
	  Assert.assertEquals(c,45);
  }
  @Test(priority=3)
  public void multiply()
  {
	   c=a*b;
	  Assert.assertEquals(c,486);
  }
  @Test(priority=1)
  public void divide()
  {
	  c=a/b;
	  Assert.assertEquals(c,6);
  }
}
