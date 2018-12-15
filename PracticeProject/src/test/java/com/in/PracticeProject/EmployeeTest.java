/**
 * 
 */
package com.in.PracticeProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Animesh
 *
 */
public class EmployeeTest {
	
	@Test
	public void testEmployeeEquality() {
		assertEquals(new Employee("animesh", 1), new Employee("animesh", 1));
	}
	
}
