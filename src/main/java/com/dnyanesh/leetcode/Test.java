package com.dnyanesh.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		int[] array = { 2, 5, 7, 3, 8 };
		twoSum(array, 15);
	}

	public static void twoSum(int[] array, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(target - array[i])) {
				int index = map.get(target - array[i]);
				System.out.println(index + " " + i);
			} else {
				map.put(array[i], i);
			}

		}
	}
}
