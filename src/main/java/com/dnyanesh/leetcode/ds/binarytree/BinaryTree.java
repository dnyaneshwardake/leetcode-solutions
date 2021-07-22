package com.dnyanesh.leetcode.ds.binarytree;

public class BinaryTree {

	private TreeNode root;

	public void addNode(int data) {
		TreeNode newNode = new TreeNode(data);
		if (root == null) {
			root = newNode;
			return;
		}

		while (true) {
			TreeNode current = root;
			if (newNode.data <= current.data) {
				if (current.left == null) {
					current.left = newNode;
					return;
				} else {
					current = current.left;
				}
			}
			if (newNode.data > current.data) {
				if (current.right == null) {
					current.right = newNode;
					return;
				} else {
					current = current.right;
				}
			}
		}
	}

	public void inorderTraversal(TreeNode root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.println(root.data);
			inorderTraversal(root.right);
		}

	}

	public int getHeight(TreeNode root) {

		TreeNode current = root;
		if (current == null) {
			return -1;
		}
		return Math.max(getHeight(current.left), getHeight(current.right)) + 1;

	}

	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		b.addNode(10);
		b.addNode(20);
		b.addNode(5);
		b.addNode(50);
		b.inorderTraversal(b.root);
		//System.out.println(b.getHeight(b.root));
	}

}
