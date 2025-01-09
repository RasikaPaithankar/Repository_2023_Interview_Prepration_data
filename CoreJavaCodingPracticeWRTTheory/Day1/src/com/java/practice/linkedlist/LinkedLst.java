package com.java.practice.linkedlist;

public class LinkedLst {
	Node head;
	
	public class Node{
		String data;
		Node next;
		
		public Node(String data){
			this.data = data;
			next = null;
		}
	}

	public LinkedLst Insert(LinkedLst list, String data) {
		Node new_node = new Node(data);
		if(list.head == null) {
			list.head = new_node;
		} else {
			Node pointer = list.head;
			while(pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = new_node;
		}
		return list;
	}
	
	public LinkedLst insertAtLocation(LinkedLst list, String data, int location) {
		int count = 0;
		Node new_node = new Node(data);
		if(list.head == null) 
		{
			System.out.println("List is empty");
			list.head = new_node;
			count++;
		} else if(isLocationGreaterThanCount(list,location)){
			
			System.out.println("List size is smaller than location, can not insert at " + location);
		}
		else {
			if(location == 1) {
				new_node.next = list.head;
				list.head = new_node;
			} else {
				Node nextPointer = list.head;
				Node PrevPointer = list.head;
				count = 1;
				while(count != location) {
					PrevPointer = nextPointer;
					nextPointer = nextPointer.next;
					count++;
				}
				PrevPointer.next = new_node;
				new_node.next = nextPointer;
			}
		}
		return list;
	}
	
	public LinkedLst insertAfterLetter(LinkedLst list, String data, String addText) {
		Node pointer = list.head;
		Node new_node = new Node(addText);
		if(list.head == null) {
			System.out.println("List is empty, can not insert letter after exact value " + data + ".");
		} else {
			while(pointer.data != data && pointer.next != null) {
				pointer = pointer.next;
			}
			if(pointer.data != data && pointer.next == null) {
				System.out.print("Data is not found in the list.");
			} else {
				if(list.head != null) {
					new_node.next = pointer.next;
				}
				pointer.next = new_node;
			}
		}
		return list;
	}
	
	public boolean isLocationGreaterThanCount(LinkedLst list, int location) {
		int count = 1;
		Node pointer = list.head;
		while(pointer != null) {
			pointer = pointer.next;
			count++;
		}
		if(count < location) {
			return true;
		}
		return false;
	}
	
	public static void printList(LinkedLst list) {
		Node ptr = list.head;
		while(ptr != null) {
			System.out.print(ptr.data);
			ptr = ptr.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedLst linkedLst = new LinkedLst();
		linkedLst.Insert(linkedLst, "S");
		linkedLst.Insert(linkedLst, "W");
		linkedLst.Insert(linkedLst, "A");
		linkedLst.Insert(linkedLst, "A");
		printList(linkedLst);
			

		linkedLst.insertAtLocation(linkedLst, "R", 4);
		linkedLst.insertAtLocation(linkedLst, "S", 6);
		System.out.println();
		printList(linkedLst);
		System.out.println();
		
		linkedLst.insertAfterLetter(linkedLst, "NM", "$");
		System.out.println();
		printList(linkedLst);
		linkedLst.insertAfterLetter(linkedLst, "S", "$");
		System.out.println();
		printList(linkedLst);
		linkedLst.insertAfterLetter(linkedLst, "$", "S");
		System.out.println();
		printList(linkedLst);
	}

}
