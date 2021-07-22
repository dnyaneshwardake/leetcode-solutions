package com.dnyanesh.leetcode.ds.stack;

import com.dnyanesh.leetcode.ds.linkedlist.ListNode;

public class StackLinkedList {

	public ListNode head;

	public void push(int item) {
		if (head == null) {
			head = new ListNode(item);
		} else {
			ListNode current = head;
			head = new ListNode(item);
			head.next = current;
		}
	}

	public int pop() {
		if (head == null) {
			System.out.println("Stack is empty...");
			return -1;
		} else {
			ListNode current = head;
			head = current.next;
			return current.data;
		}
	}

	public int peek() {
		if (head == null) {
			return -1;
		} else {
			ListNode current = head;
			return current.data;
		}
	}

	public void printStack() {
		if (head == null) {
			return;
		} else {
			ListNode current = head;
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	public static void main(String[] args) {
		StackLinkedList stack = new StackLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.printStack();
		System.out.println("--------------------");
		System.out.println("Removed " + stack.pop());
		System.out.println("Peek " + stack.peek());
		stack.printStack();
	}

}
