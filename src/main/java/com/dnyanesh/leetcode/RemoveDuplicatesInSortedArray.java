package com.dnyanesh.leetcode;

class RemoveDuplicatesInSortedArray {

	public static int removeDuplicates(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;

	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 1, 5, 7, 9 };
		System.out.println(removeDuplicates(array));
	}
}