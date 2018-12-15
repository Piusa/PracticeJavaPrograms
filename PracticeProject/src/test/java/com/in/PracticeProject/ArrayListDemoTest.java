/**
 * 
 */
package com.in.PracticeProject;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Animesh
 *
 */
public class ArrayListDemoTest {
	private ArrayListDemo ad;
	
	@Before
	public void init() {
		ad = new ArrayListDemo();
	}
	
	@Test
	public void testArrayListSortingDemo() {
		//Integer[] integerArray = {5, 10, 20, 40, 30};
		//List<Integer> expected = Arrays.asList(integerArray);
		List<Integer> expected = Arrays.asList(5, 10, 20, 30, 40);
		List<Integer> actual = ad.arrayListSortingDemo(Arrays.asList(5, 10, 20, 40, 30));
		for(int i=0; i<actual.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void testArrayListSortingDemoUsingAssertThat() {
		List<Integer> expected = Arrays.asList(5, 10, 20, 30, 40);
		List<Integer> actual = ad.arrayListSortingDemo(Arrays.asList(5, 10, 20, 40, 30));
		assertThat(expected, is(actual));
	}
	
	@After
	public void destroy() {
		ad=null;
	}

}
