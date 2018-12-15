/**
 * 
 */
package com.in.PracticeProject;

/**
 * @author Animesh
 *
 */
public class PrintArrayElementsWithoutLoops {
	public static void printElements(int[] array, int index) {
		if(index!=-1) {
			printElements(array, index-1);
			System.out.print(array[index] + " ");
			// printElements(array, index-1);	// This line in this position (i.e., after Sopln()) will print the array in Reverse order.
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 30, 40, 20, 60, 50 };
		printElements(arr, arr.length-1);
	}

}
