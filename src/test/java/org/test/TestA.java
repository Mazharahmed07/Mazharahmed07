package org.test;

import org.junit.Assert;
import org.junit.Test;

public class TestA {
	@Test
	public void testA1() {
		System.out.println("TestA1");
	}
	@Test
	public void testA2() {
		System.out.println("TestA2");
	}
	@Test
	public void testA3() {
		Assert.assertTrue("Verify A3",false);
		System.out.println("TestA3");
	}

}