package com.dnyanesh.leetcode;

import java.util.Stack;

public class ValidParentheses {

	public static Boolean isValid(String s) {
		if (s.length() % 2 == 1 || s.length() == 0) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {
			case '(':
			case '{':
			case '[':
				stack.push(s.charAt(i));
				break;
			case ')':
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
					break;
				} else {
					return false;
				}
			case '}':
				if (!stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
					break;
				} else {
					return false;
				}
			case ']':
				if (!stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
					break;
				} else {
					return false;
				}
			default:
				break;
			}
		}
		if (stack.empty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Boolean valid = isValid("{}{[]}");
		System.out.println(valid);
	}

}
