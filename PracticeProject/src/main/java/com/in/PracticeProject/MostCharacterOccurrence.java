/**
 * 
 */
package com.in.PracticeProject;

import java.util.Scanner;

/**
 * @author Animesh
 *
 */
public class MostCharacterOccurrence {
	public static void mostCharacterOccurrenceInAString(String s) {
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
				if (i == s.indexOf(s.charAt(i))) {
					char c = s.charAt(i);
					for (int j = i + 1; j < s.length() - 1; j++) {
						if (c == s.charAt(j))
							count++;
					}
					System.out.println(c + " occurred " + count + " times.");
					count = 1;
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter String : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		mostCharacterOccurrenceInAString(s);
	}

}
