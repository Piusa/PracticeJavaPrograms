
package com.in.PracticeProject;

import java.util.Comparator;

/**
 * @author ANIMESH
 *
 */
public class MyComp1 implements Comparator {

	public int compare(Object o1, Object o2) {
		Emp1 e1 = (Emp1) o1;
		Emp1 e2 = (Emp1) o2;

		Integer salary1 = e1.getSalary();
		Integer salary2 = e2.getSalary();

		Integer age1 = e1.getAge();
		Integer age2 = e2.getAge();

//		if (age1 >= 30 || age2 >= 30) {
//			//return age1.compareTo(age2);
//			return -1;
//		} else {
//			return salary2.compareTo(salary1);
//		}
		
		
		/**
		 * This block of code is to display employees acc. to descending
		 * order of ages if the ages are >30.
		 */
		if(age1 >= 30 && age1 > age2) 
			return -1;
		
		if(age2 >= 30 && age1 < age2)
			return +1;
		 else {
			return salary2.compareTo(salary1);
		}

	}
}
