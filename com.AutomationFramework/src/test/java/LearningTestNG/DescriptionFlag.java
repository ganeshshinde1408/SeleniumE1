package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
  @Test(description = "login method",priority = 1)
  public void login() {
	  Reporter.log("This is login method", false);
  }
  
  @Test(description = "logout method",priority = 2)
  public void logout() {
	  Reporter.log("This is logout method", false);
  }
}
