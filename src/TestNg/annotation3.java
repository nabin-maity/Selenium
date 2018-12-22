package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class annotation3 {
	
	//************** invocation (to run more than 1 time we use invocation)****************)
	@Test(invocationCount=5)
	public void script5()
	{
		
		Reporter.log("Script 5", true);
		
	}

}
