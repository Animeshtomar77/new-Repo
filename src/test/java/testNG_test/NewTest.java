package testNG_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test(priority =0)
  public void testMethod1() {
	  System.out.println("test method 1");
  }

  
  @BeforeMethod(dependsOnMethods = "beforeMethod2")
  public void beforeMethod1() {
	  System.out.println("before method 1");
  }

  @AfterMethod
  public void afterMethod1() {
	  System.out.println("after method 1");
  }
  
  @BeforeMethod
  public void beforeMethod2() {
	  System.out.println("before method 2");
  }

  @AfterMethod
  public void afterMethod2() {
	  System.out.println("after method 2");
  }

  @BeforeClass()
  public void beforeClass1() {
	  System.out.println("before class 1");
  }

  @AfterClass
  public void afterClass1() {
	  System.out.println("after class 1");
  }

}
