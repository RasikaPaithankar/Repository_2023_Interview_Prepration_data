package com.java.practice.linkedlist;

public class LinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public LinkedList insert(LinkedList list,int data) {
		Node n = new Node(data);
		
		if(list.head == null) {
			list.head = n;
		} else {
			Node lastpointer = list.head;
			while(lastpointer.next != null) {
				lastpointer = lastpointer.next;
			}
			lastpointer.next = n;
		}
		
		return list;
	}
	
	
	public static void traverse(LinkedList list) {
		Node pointer = list.head;
		
		while(pointer != null) {
			System.out.print(pointer.data + " ");
			pointer = pointer.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);
		traverse(list);

	}

}
