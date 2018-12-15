/**
 * 
 */
package com.in.PracticeProject;

import java.util.Scanner;

/**
 * @author Animesh
 *
 */
public class String35Percent {

	public String StringWith35PercentConcatenated(String s) {
		int count=0;
		String concated = "";
//		String[] strarray = s.split(" ");
//		for(int i=0; i<strarray.length; i++) {
//			if(count==strarray.length-1)
//				System.out.print(strarray[i]);
//			else {
//				System.out.print(strarray[i]+"35%");
//				count++;
//			}
//		}
		
//		for(String s1 : s.split(" ")) {	
//			if(count==(s.lastIndexOf(' ')+1))
//				System.out.print(s1);
//			else {
//				System.out.print(s1+"35%");
//				count = (count+1)+s1.length();
//			}
//		}
		
		for(int i=0; i<s.length()-1; i++) {
			if(count==(s.lastIndexOf(' ')+1)) {
				concated=concated+s.substring(count);
				break;
			}
			if(s.charAt(i)==' ') {
				concated=concated+"35%";
				//System.out.print("35%");
				count++;
			}
			else {
				concated=concated+s.charAt(i);
				//System.out.print(s.charAt(i));
				count++;
			}
		}
		return concated;
	}
	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Line : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
//		String s = "my name is animesh pal";
		String35Percent sp = new String35Percent();
		System.out.println(sp.StringWith35PercentConcatenated(s));
	}

}
