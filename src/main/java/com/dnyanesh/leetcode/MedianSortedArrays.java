package com.dnyanesh.leetcode;

public class MedianSortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] finalArray = new int[nums1.length + nums2.length];
		if (finalArray.length == 0) {
			return 0.0;
		}
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < finalArray.length; i++) {

			if (count1 < nums1.length && count2 < nums2.length && nums1[count1] == nums2[count2]) {
				finalArray[i] = nums1[count1];
				count1++;
				finalArray[++i] = nums2[count2];
				count2++;
				continue;
			}
			if (count1 < nums1.length && (count2 == nums2.length || nums1[count1] < nums2[count2])) {
				finalArray[i] = nums1[count1];
				count1++;
				continue;
			} else if (count2 < nums2.length && (count1 == nums1.length || nums1[count1] > nums2[count2])) {
				finalArray[i] = nums2[count2];
				count2++;
				continue;
			}
		}

		if (finalArray.length % 2 == 0) {
			double x = finalArray[finalArray.length / 2 - 1];
			double y = finalArray[finalArray.length / 2];
			return (x + y) / 2;
		} else {
			return finalArray[finalArray.length / 2];
		}

	}

	public static void main(String[] args) {
		int[] num1 = { 2, 2, 4, 4, 5 };
		int[] num2 = { 2, 2, 4, 4 };
		double median = findMedianSortedArrays(num1, num2);
		System.out.println(" Median: " + median);
	}

}
