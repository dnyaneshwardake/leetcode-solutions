package com.dnyanesh.leetcode.ds.linkedlist;

public class LinkedList {
	ListNode head;

	public void add(int data) {
		ListNode node = new ListNode(data);
		ListNode n = head;
		if (n == null) {
			head = node;
		} else {
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void show() {
		ListNode node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public void addAtFirst(int data) {
		if (head == null) {
			add(data);
		} else {
			ListNode node = new ListNode(data);
			node.next = head;
			head = node;
		}
	}

	public void addAt(int index, int data) {
		if (index == 0) {
			addAtFirst(data);
		} else {
			ListNode node = new ListNode(data);
			ListNode n = head;
			for (int i = 1; i < index; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}

	}

	public void delete(int index) {
		if (index == 0) {
			head = head.next;
			return;
		}
		ListNode n = head;
		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		ListNode n1 = n.next;
		n.next = n1.next;
		System.out.println("deleted " + n1.data);
	}

	public int size() {
		int count = 0;
		ListNode temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void reverse() {
		ListNode next = null;
		ListNode previous = null;
		ListNode current = head;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}
}
