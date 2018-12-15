/**
 * To sort employees according to their salary in descending order.
 * But, if age > 30, then Employees with  will come last in the order.
 */
package com.in.PracticeProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ANIMESH
 *
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp1 e1 = new Emp1("name1", 100, 27);
		Emp1 e2 = new Emp1("name2", 200, 29);
		Emp1 e3 = new Emp1("name3", 150, 31);
		Emp1 e4 = new Emp1("name4", 150, 30);
		
		List<Emp1> list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list, new MyComp1());
		
		System.out.println(list);
	}
}
