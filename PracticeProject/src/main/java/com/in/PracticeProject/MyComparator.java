/**
 * 
 */
package com.in.PracticeProject;

import java.util.Comparator;

/**
 * @author Animesh
 *
 */
public class MyComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		Integer I1 = e1.getId();
		Integer I2 = e2.getId();
		String s1 = e1.getName();
		String s2 = e2.getName();
		
		if(s1.equals(s2))
			return I2.compareTo(I1);
		else
			return s2.compareTo(s1);
	}
}
