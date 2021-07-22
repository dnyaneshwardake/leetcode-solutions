package com.dnyanesh.leetcode.ds.stack;

public class StackArray {

	int capacity;
	int top;
	int[] array;

	public StackArray(int capacity) {
		this.array = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}

	public void push(int num) {
		if (top == capacity) {
			System.out.println("Stack overflow");
			return;
		} else {
			array[++top] = num;
		}
	}

	public int pop() {
		if (top == -1) {
			System.out.println("No data to remove, stack is empty");
			return -1;
		} else {
			return array[top--];
		}
	}

	public int peek() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			return array[top];
		}
	}

	public Boolean isFull() {
		return capacity - 1 == top; // -1 because top is initialized to -1
	}

	public Boolean isEmpty() {
		return top == -1;
	}

	public void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {

		StackArray s = new StackArray(10);

		s.push(5);
		s.push(10);
		s.push(15);
		s.pop();
		s.printStack();
	}
}
