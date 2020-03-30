package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demotest1 {

		@Test
		public void sum() {
			System.out.println("sum");
			int a=20;
			int b = 30;
			Assert.assertEquals(50, a+b);
			
			
		}
}
