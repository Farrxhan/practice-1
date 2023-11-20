package com.app.TestNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	@Test
	public void method1() {
		String ExpectedResult = "selenium";
		String ActualResult = "seleniumTest";
		
		Assert.assertNotEquals(ExpectedResult,ActualResult);
		
	}
	@Test
	public void method2() {
		String ActualResult= null;
		Assert.assertNotNull(ActualResult);
		
		
	}

}
