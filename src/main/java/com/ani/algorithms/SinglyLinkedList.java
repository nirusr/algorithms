package com.ani.algorithms;

import java.util.Iterator;
import java.util.ListIterator;

public class SinglyLinkedList<E> {
	

	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	//Define Node Class
	private static class Node<E> {
		//defined node variables
		private E element;
		private Node<E> next;
		
		//define constructor to build node
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
			
		}
		//Getter and Setter

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}
		
		
	
	}
	
	//define head and tail nodes
	Node<E> head = null;
	Node<E> tail = null;
	private int size = 0;
	
	
	//check size
	public boolean isEmpty() { return size == 0 ; }
	
	//Get first
	public E firstElementValue() {
		if ( isEmpty()) return null;
		return head.getElement();
	}
	
	//Get Last
	public E LastElementValue() {
		if (isEmpty()) return null;
		
		return tail.getElement();
		
		
	}
	//add First
	public void addFirst(E e) {
		
		Node<E> newest = new Node<E>(e, head);
		head = newest;
		
		if ( isEmpty()) tail = head;
		
		size++;
	}
	//add Last
	public  void addLast(E e) {
		
		Node<E> newest = new Node<E>(e, null);
		if (isEmpty()) {
			head = newest;
		} else {
		
			tail.setNext(newest);
		}
		tail = newest;
		size++;
	}
	
	//remove first
	public E removeFirst() {
		if (isEmpty()) return null;
		
		E element = head.getElement();
		head = head.getNext();
		head.setNext(null);
		size--;
		if (size == 0) return null;
		return element;
	
		
	}
	
	public static void main( String[] args) {
		SinglyLinkedList<String> ll_airports = new SinglyLinkedList<String>();
		ll_airports.addFirst("1FO");
		ll_airports.addLast("3AA");
		ll_airports.addFirst("2AA");
		ll_airports.addLast("4AA");
		ll_airports.addLast("5AA");
		
		Node<String> n  = ll_airports.head;
		int list_size = ll_airports.size;
		while(list_size > 0) {
			System.out.print(n.getElement() + "==>");
			n = n.getNext();
			list_size--;
		}
		
		System.out.println(1%2);
		
		
		
	}
	
	
		
}
	
	
	

