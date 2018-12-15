/**
 * 
 */
package com.in.PracticeProject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Animesh
 *
 */
public class HashMapDemoForDuplicateKeys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "A");
		m.put(2, "B");
		m.put(3, "C");
		m.put(4, "D");
		m.put(3, "E");
		System.out.println(m);
	}

}
