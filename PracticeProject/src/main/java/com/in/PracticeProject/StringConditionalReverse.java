/**
 * 
 */
package com.in.PracticeProject;

/**
 * @author Animesh
 *
 */
public class StringConditionalReverse {

	/**
	 * @param args
	 */
	public String stringReversingOnCondition(String s) {
		String originalOrReverse="";
		boolean flag = false;
		for (String s1 : s.split(" ")) {
			for (char c : s1.toCharArray()) {
				if ((c < 65 || c > 90) && (c < 97 || c > 122)) {
					flag = true;
					break;
				}
			}
			if (flag) {
				//System.out.print(s1+" ");
				flag=false;
				originalOrReverse = originalOrReverse+s1+" ";
			}
			else {
				String reverse = "";
				for(int i=s1.length()-1; i>=0; i--) {
					reverse = reverse + s1.charAt(i);
				}
				//System.out.print(reverse+" ");
				originalOrReverse = originalOrReverse+reverse+" ";
			}
		}
		return originalOrReverse;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my name is #ani pal";
		StringConditionalReverse scr = new StringConditionalReverse();
		System.out.println(scr.stringReversingOnCondition(s));
	}
}
