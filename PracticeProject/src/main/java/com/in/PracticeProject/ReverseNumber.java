/**
 * 
 */
package com.in.PracticeProject;

import java.util.Scanner;

/**
 * @author Animesh
 *
 */
public class ReverseNumber {
	public static int numberReverse(int num) {
		int reverse = 0;
		
		while(num!=0) {
			reverse = (reverse*10)+(num%10);
			num = num/10;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Reversed NUmber : "+numberReverse(number));
	}
}
