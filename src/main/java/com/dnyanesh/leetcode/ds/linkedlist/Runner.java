package com.dnyanesh.leetcode.ds.linkedlist;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(2);
		list.add(5);
		list.add(20);
		// list.addAtFirst(22);
		// list.addAt(2, 24);
		//list.delete(0);
		list.reverse();
		list.show();
		System.out.println("Size " + list.size());
	}
}
