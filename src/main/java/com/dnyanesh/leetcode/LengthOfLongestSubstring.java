package com.dnyanesh.leetcode;

public class LengthOfLongestSubstring {

	// length of Longest non repeating substring

	public static int lengthOfLongestSubstring(String s) {
		String temp = "";
		String result = "";
		int i = 0;
		for (i = 0; i < s.length(); i++) {
			if (!temp.contains(String.valueOf(s.charAt(i)))) {
				temp += s.charAt(i);
				if (temp.length() > result.length()) {
					result = temp;
				}
			} else {
				i = i - (temp.length());
				temp = "";
			}

		}
		return result.length();
	}

	public static void main(String[] args) {
		String s = "abcabcbbrnmpo";
		int value = lengthOfLongestSubstring(s);
		System.out.println(value);
	}

}
