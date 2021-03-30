package com.dnyanesh.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static int romanToInt(String s) {
		Map<String, Integer> romanMap = new HashMap<String, Integer>();
		romanMap.put("I", 1);
		romanMap.put("V", 5);
		romanMap.put("X", 10);
		romanMap.put("L", 50);
		romanMap.put("C", 100);
		romanMap.put("D", 500);
		romanMap.put("M", 1000);
		int sum = 0;
		int i;
		for (i = 0; i < s.length() - 1; i++) {
			int current = romanMap.get(String.valueOf(s.charAt(i)));
			int next = romanMap.get(String.valueOf(s.charAt(i + 1)));

			if (current < next) {
				sum = sum - current;
			} else {
				sum = sum + current;
			}

		}
		sum += romanMap.get(String.valueOf(s.charAt(i)));
		return sum;
	}

	public static void main(String[] args) {
		String roman = "IV";
		int result = romanToInt(roman);
		System.out.println("Result: " + result);
	}

}
