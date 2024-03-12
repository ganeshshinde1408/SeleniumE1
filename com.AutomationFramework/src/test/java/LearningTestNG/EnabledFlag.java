package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
  @Test(enabled = false)
  public void login() {
	  Reporter.log("login method",true);
  }
  @Test(enabled = true)
  public void logout() {
	  Reporter.log("logout method",true);
  }
}
