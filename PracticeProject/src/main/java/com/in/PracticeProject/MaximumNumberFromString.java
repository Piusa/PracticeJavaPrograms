package com.in.PracticeProject;

public class MaximumNumberFromString {

	public static int computeMaximum(String s) {
		int number = 0;
		int max = 0;
		int cnt = 0;

		for (char c : s.toCharArray()) {
			cnt++;
			if (c >= 48 && c <= 57)
				number = (number * 10) + (c - 48);
			if (c > 57 || cnt == s.length()) {
				if (max < number) {
					max = number;
				}
				number = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// String s = "abcdefg084hv485dhv234bdbvqbv";
		String s = "abcdefg084hvdhv234bdbvqbv485";
		System.out.println("Maximum number : " + computeMaximum(s));
	}
}