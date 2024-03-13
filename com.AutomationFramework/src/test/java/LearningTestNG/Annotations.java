package LearningTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void test1() {
	  Reporter.log("This is @Test1",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("This is Before Method",true);
  }
  

  @AfterMethod
  public void afterMethod() {
	  
	  Reporter.log("This is After Method",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("This is Before Class",true);  
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("This is After Class",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("This is Before Test",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("This is After Test",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("This is Before Suite",true);
  }
  @Test
  public void test3() {
	  Reporter.log("This is @Test3",true);
}

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("This is After Suite",true);
  }
  @Test
  public void test2() {
	  Reporter.log("This is @Test2",true);
}
}