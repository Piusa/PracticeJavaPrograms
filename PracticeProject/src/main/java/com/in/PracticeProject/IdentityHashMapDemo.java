/**
 * 
 */
package com.in.PracticeProject;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * @author Animesh
 *
 */
public class IdentityHashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, Integer> m = new HashMap<Employee, Integer>();
		m.put(new Employee("Animesh", 1), 1);
		m.put(new Employee("Vipul", 2), 2);
		m.put(new Employee("Atul", 3), 3);
		m.put(new Employee("Sneha", 4), 4);
		m.put(new Employee("Shweta", 5), 5);
		m.put(new Employee("Sneha", 4), 8);
		
		System.out.println(m);
		System.out.println(m.get(new Employee("Vipul", 2)));
	}

}
