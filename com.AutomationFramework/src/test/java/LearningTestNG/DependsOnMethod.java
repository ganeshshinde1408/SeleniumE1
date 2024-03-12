package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test(priority = 1)
  public void login() {
	  Reporter.log("login method",true);
  }
  @Test( priority = 2,dependsOnMethods = "login")
  public void logout() {
	  Reporter.log("logout method",true);
  }
}
