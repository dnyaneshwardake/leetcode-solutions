package com.dnyanesh.leetcode;

public class MedianSortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] finalArray = new int[nums1.length + nums2.length];
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < finalArray.length; i++) {

			if (!(count2 == nums1.length - 1) && !(count1 == nums2.length - 1) && nums1[i] == nums2[i]) {
				finalArray[i] = nums2[i];
				finalArray[i + 1] = nums1[i];
				count1++;
				count2++;
			} else if (!(count1 == nums2.length - 1) && nums1[i] > nums2[i]) {
				count1++;
				finalArray[i] = nums2[i];
			} else if (!(count2 == nums1.length - 1) && nums1[i] < nums2[i]) {
				count2++;
				finalArray[i] = nums1[i];
			}
		}
		for (int i = 0; i < finalArray.length; i++) {
			System.out.print(" " + finalArray[i]);
		}

		return 1;
	}

	public static void main(String[] args) {

		int[] num1 = { 1, 2 };
		int[] num2 = { 3, 4 };
		double median = findMedianSortedArrays(num1, num2);
		System.out.println(median);
	}

}
