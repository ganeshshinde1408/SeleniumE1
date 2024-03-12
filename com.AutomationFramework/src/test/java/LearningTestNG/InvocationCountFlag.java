package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
	
		  @Test(priority = 1,invocationCount = 2)
		  public void login() {
			  Reporter.log("login method",true);
		  }
		  @Test(priority = 2,invocationCount = 3)
		  public void logout() {
			  Reporter.log("logout method",true);
		  }
  }
