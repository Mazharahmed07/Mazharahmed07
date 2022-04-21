package org.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestC {
	@Test
	public void testC1() {
		System.out.println("TestC1");
	}
	@Test
	public void testC2() {
		System.out.println("TestC2");
	}
	@Ignore
	@Test
	public void testC3() {
		Assert.assertTrue("Verify A3",false);
		System.out.println("TestC3");
	}

}
