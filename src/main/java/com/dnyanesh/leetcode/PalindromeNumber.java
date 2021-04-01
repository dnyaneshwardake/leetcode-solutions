package com.dnyanesh.leetcode;

public class PalindromeNumber {

	private static boolean isPalindrome;

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int reverse = 0;
		int org = x;
		while (x != 0) {
			int digit = x % 10;
			x = x / 10;
			reverse = reverse * 10 + digit;
		}
		return reverse == org ? true : false;
	}

	public static void main(String[] args) {
		isPalindrome = isPalindrome(1232);
		System.out.println(isPalindrome);
	}

}
