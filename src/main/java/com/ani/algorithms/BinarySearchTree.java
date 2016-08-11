package com.ani.algorithms;


public class BinarySearchTree {
	
	public static Node root;
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		this.root = null;
	}
	
	
	/*
	 * Create a tree
	 * id = data
	 * data < root.data go left
	 * data > root.data go right
	 * we know only root node at the beginning to start with...
	 */
	public void insert(int id) {
		//Node to be inserted
		Node newNode = new Node(id);
		
		//if no node exists, this will be root node
		if ( root == null ) {
			root = newNode;
			return;
			
		}
		
		//if there is a root node, start from there
		Node current = root;
		
		while (true) {
			
			if ( id < current.data ) {
				if ( current.left == null) {
					current.left = newNode;
					return;
				} else {
					current = current.left;
				}
			} 
			
			if ( id > current.data) {
				if ( current.right == null) {
					current.right = newNode;
					return;
				} else {
					current = current.right;
				}
			}
			
			
			
		}
		
	}
	public void display(Node root)  {
		if ( root !=null) {
			display(root.left);
			System.out.print(" " + root.data);
		//	System.out.println(" ");
			display(root.right);
			
			
		}
	}
	
	
	
	
	//TEST
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(20);
		bst.insert(10);
		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		bst.insert(4);
		bst.insert(6);
		bst.insert(8);
		bst.insert(21);
		bst.display(bst.root);
	}
	

}
//Node definition
class Node {
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
}
