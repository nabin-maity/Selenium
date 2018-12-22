package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Annotation2 {
//	@Test(priority=-4)
//	public void dscript1()
//	{
//		Reporter.log("script 1",true);
//	}
//	
//	@Test(priority=3)
//	public void cscript2()
//	{
//		//System.out.println("script 3");
//		Reporter.log("Script 2", true);
//		
//	}
//	
//	@Test(priority=0)
//	public void bscript3()
//	{
//		Reporter.log("script 3",true);
//	}
//	
//	@Test(priority=2)
//	public void ascript4()
//	{
//		//System.out.println("script 3");
//		Reporter.log("Script 4", true);
//		
//	}
//	//***************** invocation & priority********************************
//	
//	@Test(priority=2,invocationCount=5)
//	public void script5()
//	{
//		
//		Reporter.log("Script 5", true);
//		
//	}

	
	@Test(groups ={"smoke","functional"})
	public void script1()
	{
		
//		boolean cond1=false;
//		Assert.assertEquals(cond1, true);
//		Assert.fail();
//		SoftAssert a= new SoftAssert();// it help us to execute the next line also and it will execute the script,for softassert we need to create object
//		a.fail();
		Reporter.log("script 1",true);
		
	}
	
	@Test(groups ={"smoke"})
	public void script2()
	{
		
		Reporter.log("Script 2", true);
		
	}
	
	@Test(groups ={"smoke"})
	public void script3()
	{
		Reporter.log("script 3",true);
	}
	
	//@Test(dependsOnGroups ={"smoke"})//depends on group will execute the same group if any one is fail it will skip. 
	@Test
	public void script4()
	{
		Reporter.log("script 4",true);
	}
	
//	@Test(dependsOnMethods={"script1","script2","script3"})
//	public void script4()
//	{
//		
//		Reporter.log("Script 4", true);
//		
//	}
}
