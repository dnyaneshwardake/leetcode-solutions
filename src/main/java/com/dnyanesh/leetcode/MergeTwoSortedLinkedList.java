package com.dnyanesh.leetcode;

public class MergeTwoSortedLinkedList {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode tempNode = new ListNode(0);
		ListNode currentNode = tempNode;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				currentNode.next = l1;
				l1 = l1.next;
			} else {
				currentNode.next = l2;
				l2 = l2.next;
			}
			currentNode = currentNode.next;
		}

		if (l1 != null) {
			currentNode.next = l1;
			l1 = l1.next;
		}
		if (l2 != null) {
			currentNode.next = l2;
			l2 = l2.next;
		}

		return tempNode.next;
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(3);
		list1.next.next = new ListNode(8);

		ListNode list2 = new ListNode(2);
		list2.next = new ListNode(5);
		list2.next.next = new ListNode(7);

		ListNode result = mergeTwoLists(list1, list2);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

}
