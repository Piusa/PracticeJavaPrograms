/**
 * 
 */
package com.in.PracticeProject;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Animesh
 *
 */

public class StringConditionalReverseTest {
	private StringConditionalReverse scr;
	
	@Before
	public void init() {
		scr = new StringConditionalReverse(); 
	}
	
	@Test
	public void testStringReversinOnCondition() {
		String expected = "ym eman si #ani lap ";
		String actual = scr.stringReversingOnCondition("my name is #ani pal");
		assertEquals(expected, actual);
	}
	
	@After
	public void destroy() {
		scr = null;
	}

}
