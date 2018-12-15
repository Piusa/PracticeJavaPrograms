/**
 * 
 */
package com.in.PracticeProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Animesh
 *
 */
public class EmployeeSorting {

	public ArrayList<Employee> sortedEmployees(ArrayList<Employee> al) {
		Collections.sort(al, (Object o1, Object o2)->{
			Employee E1 = (Employee) o1;
			Employee E2 = (Employee) o2;
			
			Integer I1 = E1.getId();
			Integer I2 = E2.getId();
			String s1 = E1.getName();
			String s2 = E2.getName();
			
			if(s1.equals(s2))
				return I2.compareTo(I1);
			else
				return s2.compareTo(s1);
		});
		
		return al;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Ani", 1);
		Employee e2 = new Employee("Swapnil", 2);
		Employee e3 = new Employee("Subhas", 3);
		Employee e4 = new Employee("Ani", 7);
		Employee e5 = new Employee("Haradhan", 5);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		System.out.println("Before Sorting.....");
		System.out.println(al);
		EmployeeSorting es = new EmployeeSorting();
		es.sortedEmployees(al);
		System.out.println("After Sorting.....");
		System.out.println(al);
	}
}
