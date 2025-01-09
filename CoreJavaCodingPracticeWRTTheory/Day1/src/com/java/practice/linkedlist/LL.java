package com.java.practice.linkedlist;

public class LL {
	
	Node head;
	
	public class Node{
		String data;
		Node next;
		
		public Node(String data) {
			this.data = data;
			next = null;
		}
	}
	
	public LL insert(LL list, String data) {
		Node n = new Node(data);
		
		if(list.head == null) {
			list.head = n;
		} else {
			Node lastPointer = list.head;
			while(lastPointer.next !=null) {
				lastPointer = lastPointer.next;
			}
			lastPointer.next = n;
		}		
		return list;	
	}
	
	public static void printList(LL list) {
		Node pointer = list.head;
		while(pointer != null) {
			System.out.print(pointer.data);
			pointer = pointer.next;
		}
	}
	
	public static void main(String[] args) {
		LL ll = new LL();
		ll.insert(ll, "S");
		ll.insert(ll, "W");
		ll.insert(ll, "A");
		ll.insert(ll, "R");
		ll.insert(ll, "A");
		ll.insert(ll, "S");
		
		printList(ll);
	}

}
