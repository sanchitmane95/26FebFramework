package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertProg {
//	@Test
//	public void method1()
//	{
//		Assert.assertEquals(false, false);
//		Assert.assertEquals(true, true);
////		Assert.assertEquals(400, 201);  //Fail
//		Assert.assertEquals(400, 400); 
//	}
//	
	@Test
	public void method1()
	{
		SoftAssert s = new SoftAssert();
		s.assertEquals(false, false);
		System.out.println("method1 started");
		s.assertEquals(false, true);
		System.out.println("method1");
		s.assertEquals(400, 201);
		System.out.println("method1 ended");
	}
	
	@Test
	public void method2()
	{
		SoftAssert s = new SoftAssert();
		s.assertEquals(false, false);
		System.out.println("method2 started");
		s.assertEquals(false, true);
		System.out.println("method2");
		s.assertEquals(400, 201);
		System.out.println("method2 ended");
		s.assertAll();
	}

}
