package day9;

import org.testng.annotations.Test;

//import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class day9_Task1 
{
	int a,b,c;
  @Test(dataProvider = "dp",priority=1)
  public void add(Integer a, Integer b) 
  {
	  
	  c=a+b;
	  Assert.assertEquals(a+b,c);
	  System.out.println(c);
  }
  @Test(dataProvider = "dp",priority=2)
  public void sub(Integer a, Integer b) 
  {
	  c=a-b;
	  Assert.assertEquals(a-b,c);
	  System.out.println(c);
  }
  @Test(dataProvider = "dp",priority=3)
  public void product(Integer a, Integer b) 
  {
	  c=a*b;
	  Assert.assertEquals(a*b,c);
	  System.out.println(c);
  }
  @Test(dataProvider = "dp",priority=4)
  public void divi(Integer a, Integer b) 
  {
	   c=a/b;
	   Assert.assertEquals(a/b,c);
	  System.out.println(c);
  }
  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { 54, 54 },
      new Object[] { 144, 12 },
    };
  }
}
