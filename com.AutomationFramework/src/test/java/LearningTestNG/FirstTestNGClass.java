package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {
  @Test(priority = 0)
  public void login() {
	  
	  Reporter.log("this is login method",false);
  }
  
  @Test(priority = 1)
public void wishlist() {
	  
	  Reporter.log("this is wishlist method",true);
  }
  
  @Test(priority = 2)
  public void addToCart() {
	  
	  Reporter.log("this is wishlist addToCart mehtod",true);
  }

  @Test(priority = 3)
  public void logout() {
	  
	  Reporter.log("this is wishlist logout method",true);
  }
}
