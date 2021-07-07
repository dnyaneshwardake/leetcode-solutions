package com.dnyanesh.leetcode;

public class RemoveNthFromEndLinkedList {

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy_head = new ListNode();
		dummy_head.next = head;
		ListNode slow = head;
		ListNode fast = head;
		for (int i = 1; i < n + 1; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return dummy_head.next;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		list.next = new ListNode(3);
		list.next.next = new ListNode(8);

		ListNode removeNthFromEnd = removeNthFromEnd(list, 2);

		while (removeNthFromEnd != null) {
			System.out.println(removeNthFromEnd.val);
			removeNthFromEnd = removeNthFromEnd.next;
		}
	}

}
