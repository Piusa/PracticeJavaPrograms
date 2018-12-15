/**
 * 
 */
package com.in.PracticeProject;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Animesh
 *
 */
public class String35PercentTest {
	private String35Percent sp;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class.....");
	}

	@Before
	public void init() {
		sp = new String35Percent();
	}

	@Test
	public void testStringWith35PercentConcatenated() {
		// String expected = "My35%Name35%is35%Animesh35%Pal";
		String expected = new String("My35%Name35%is35%Animesh35%Pal");
		String actual = sp.StringWith35PercentConcatenated("My Name is Animesh Pal");
		assertEquals(expected, actual);
	}

	@After
	public void destroy() {
		sp = null;
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class.....");
	}

}
