package com.ani.algorithms;


public class BinarySearchTree {
	
	public static Node root;
	public static int nodeCount = 1;
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
			
			if ( id == current.data) return; //duplicate insert
			
			
			
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
	
	public static void printBinaryTree(Node root, int level){
	    if(root==null)
	         return;
//	    System.out.println("pBT(" + root.right.data + "," + level + 1);
	    printBinaryTree(root.right, level+1);
	   
	    if(level!=0){
	        for(int i=0;i<level-1;i++)
	            System.out.print("|\t");
	            System.out.println("|-------"+root.data);
	            nodeCount++;
	    }
	    else {
	        System.out.println(root.data);
	        nodeCount++;
	    }
//	    System.out.println("pBT(" + root.left.data + "," + level + 1);
	    printBinaryTree(root.left, level+1);
	   
	}    
	
	
	
	public int printNodeValueL(Node node, int level) {
		int count = 0;
		if (node == null) {
			return 0;
		} else {
			//System.out.print(node.data);
			//System.out.println("," + level);
			if ( level == 1) {
				System.out.println(level + "," + node.data );
				

					if ( node.left != null ) {
						System.out.println( "Left:" + node.left.data);
						count ++;
					}
					if ( node.right != null) {
						System.out.println("Right:" + node.right.data);
						count ++;
						
					}
				System.out.println("count:" + count);
				return count;
				
			}
			
		}
		return count + printNodeValueL(node.left, level + 1);
		//count + printNodeValue(node.right, level + 1);
		
		//System.out.println(node.data);
		
		
		

	}
	
	public int printNodeValueR(Node node, int level) {
		int count = 0;
		if (node == null) {
			return 0;
		} else {
			//System.out.print(node.data);
			//System.out.println("," + level);
			if ( level == 1) {
				System.out.println(level + "," + node.data );
				

					if ( node.left != null ) {
						System.out.println( "Left:" + node.left.data);
						count ++;
					}
					if ( node.right != null) {
						System.out.println("Right:" + node.right.data);
						count ++;
						
					}
				System.out.println("count:" + count);
				return count;
				
			}
			
		}
		//return count + printNodeValue(node.left, level + 1);
		return count + printNodeValueR(node.right, level + 1);
		
		//System.out.println(node.data);
		
		
		

	}
	
	public int printNodeCount(Node node, int level) {
		return printNodeValueL(node, level) + printNodeValueR(node, level);
	}
	
	public boolean find(int id) {
		Node current = root;
		while( current != null) {
			
			if ( id < current.data) {
				current = current.left;
				if ( current == null ) return false;
			}
			
			if (id > current.data) {
				current = current.right;
				if ( current == null) return false;
			}
			
			if ( id == current.data) {
				return true;
			}
			
		}
		
		return false;
	}
	
	
	//find # of nodes To Be Worked.
	public int getLeafCount() {
		//int count = 1;
		
		return getLeafCount(root);
		
		
	}
	
	public int getLeafCount(Node node) {
		if ( node == null) {
			return 0;
		} 
		if ( node.left == null && node.right == null) {
			return 1;
		} else {
			return getLeafCount(node.left) + getLeafCount(node.right);
		}
			
	}
	
	public int countNodeAtLevel(Node node, int level) {
		int count=0;
		if ( node == null) return 0;
		if ( level == 0) {
			return 0;
		} else {
			if ( node.left != null ) {
				count++;
				return count + countNodeAtLevel(node.left, level + 1);
			} else {
				return 0;
			}
			
		}
		
	}
	
	//TEST
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		/*bst.insert(25);
		bst.insert(16);
		bst.insert(15);
		bst.insert(10);
		bst.insert(9);
		bst.insert(8);
		bst.insert(6);
		bst.insert(4);
		bst.insert(3);
		bst.insert(2);
		bst.insert(1);
		bst.insert(12);
		bst.insert(11);
		bst.insert(14);
		bst.insert(15);*/
		bst.insert(50);
		bst.insert(40);
		bst.insert(45);
		bst.insert(46);
		bst.insert(44);
		bst.insert(30);
		
		
		bst.insert(80);
		bst.insert(20);
		bst.insert(35);
		bst.insert(100);
		bst.insert(90);
		bst.insert(110);
		
		
		/*
		 *              20
		 *            10
		 *          1
		 *             2
		 *          
		 *          
		 *          
		 */
		
		bst.display(bst.root);
		System.out.println("\n");
		bst.printBinaryTree(bst.root, 0);
	
		System.out.println("\n" + bst.find(22));
		//System.out.println("\n" + bst.getLeafCount() );
		System.out.println(nodeCount);
		bst.printNodeValueL(root, 0) ;
		bst.printNodeValueR(root, 0) ;
		System.out.println(bst.printNodeCount(root, 0));
		
		System.out.println("=" + bst.countNodeAtLevel(root,1));
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
