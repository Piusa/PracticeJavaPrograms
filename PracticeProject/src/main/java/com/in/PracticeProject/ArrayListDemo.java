/**
 * 
 */
package com.in.PracticeProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Animesh
 *
 */
public class ArrayListDemo {
	
	public List<Integer> arrayListSortingDemo(List<Integer> al) {
		Collections.sort(al);
		return al;
	}

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(40);
		al.add(10);
		al.add(5);
		al.add(30);
		System.out.println(al);
		ArrayListDemo ad = new ArrayListDemo();
		System.out.println(ad.arrayListSortingDemo(al));
	}
}
