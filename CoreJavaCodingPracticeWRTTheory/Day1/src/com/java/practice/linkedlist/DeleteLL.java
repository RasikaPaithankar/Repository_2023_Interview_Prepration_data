package com.java.practice.linkedlist;

public class DeleteLL {
	Node head;
	
	public class Node {
		String data;
		Node next;
		
		public Node(String data) {
			this.data = data;
			next = null;
		}
	}
	
	public DeleteLL Insert(DeleteLL list, String data) {
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
	
	public DeleteLL deleteAtEnd(DeleteLL list) {
		Node previous = null;
		Node next_pointer = list.head;
		while(next_pointer.next != null) {
			previous = next_pointer;
			next_pointer = next_pointer.next;
		}
		previous.next = null;
		return list;
	}
	
	public DeleteLL deleteAtLcn(DeleteLL list, int location) {
		Node previous = list.head;
		Node next_pointer = list.head;
		int counter = 1;
		if(list.head == null) {
			System.out.println("List is empty.");
		} else if(location == 1) {
			if(list.head.next == null) {
				list.head.data = null;
				list.head.next = null;
				list = null;
			} else {
				next_pointer = list.head.next;
				list.head = next_pointer;
				previous.next = null;
			}
		}
		else if(checkValidLocation(list, location)) {
			System.out.println(location +" is not a valid location to delete.");
		} else {
			while(counter != location) {
				previous = next_pointer;
				next_pointer = next_pointer.next;
				counter++;
			}
			if(next_pointer != null) {
				previous.next = next_pointer.next;			
			}
		}
		
		return list;
	}
	
	private boolean checkValidLocation(DeleteLL list, int location) {
		int counter = 1;
		boolean result = false;
		Node pointer = list.head;
		while(pointer.next != null) {
			pointer = pointer.next;
			counter++;
		}
		if(location > counter) {
			result = true;
		}
		return result;
	}
	
	public static void printList(DeleteLL list) {
		Node ptr = list.head;
		while(ptr != null) {
			System.out.print(ptr.data);
			ptr = ptr.next;
		}
	}
	
	public static void main(String[] args) {
		DeleteLL deleteLL = new DeleteLL();
		
		deleteLL.Insert(deleteLL, "A");
		deleteLL.Insert(deleteLL, "B");
		deleteLL.Insert(deleteLL, "C");
//		deleteLL.Insert(deleteLL, "D");
//		deleteLL.Insert(deleteLL, "E");
//		deleteLL.Insert(deleteLL, "F");
//		deleteLL.Insert(deleteLL, "G");
//		deleteLL.Insert(deleteLL, "H");
		
		printList(deleteLL);
		
		System.out.println();
		deleteLL.deleteAtEnd(deleteLL);
		printList(deleteLL);
		System.out.println();
		deleteLL.deleteAtEnd(deleteLL);
		printList(deleteLL);
		System.out.println();
		deleteLL.deleteAtLcn(deleteLL, 1);
		printList(deleteLL);

		//System.out.println();
		//deleteLL.deleteAtLcn(deleteLL, 1);
		//printList(deleteLL);

		//		System.out.println();
//		deleteLL.deleteAtLcn(deleteLL, 8);
//		deleteLL.deleteAtLcn(deleteLL, 2);
//		printList(deleteLL);
	}

}
