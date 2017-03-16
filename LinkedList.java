package com.chi;

public class LinkedList {
	
	public Node head;  //the head node of this list
	public Node currentPosition;  //it points to a node which is new added, or call last node
	public int lengthOfList = 0;  //it counts the length of list
	
	
	//add a new node to link list
	public void addNode(int data) {
		Node node = new Node(data);
		if(this.lengthOfList == 0) {
			this.currentPosition = node;
			this.head = node;	
			this.lengthOfList++;
			
		} else {
			this.currentPosition.next = node;
			this.currentPosition = node;
			this.lengthOfList++;
		}
	}
	
	//get the data from index
	public int getDataOfGivenIndex(int index) {
		int i = 0;
		if (index < 0 || index >= lengthOfList) {
			//System.out.println("out of bounds!!");
			return -1;
		}
		Node p = this.head;
		
		while (p.next != null && i < index ) {
			p = p.next;
			i++;
		}
		return p.data;
	}
	
	//find given data and return its locate if it locates in the list
	public int locateData(int data) {
		int i = 0;
		Node p = this.head;
		while(p != null && p.data != data) {
			p = p.next;
			i++;
		}
		if(p == null) {
			return -1;
		}
		return i;
	}
	
	//insert node between the position of "locate" and "locate+1"
	public void insertNode(int data, int locate) {
		Node p, q;
		int i;
		if(locate < 0) {
			return ;
		}
		p = this.head;
		for(i = 1; i < locate && p != null; i++) {
			p = p.next;
		}
		q = new Node(data);		
		if(locate != 0) {
			q.next = p.next;
			p.next = q;
			this.lengthOfList++;
		} else {
			q.next = this.head;
			this.head = q;
			this.lengthOfList++;
		}
	}

	//delete node for given location
	public int deleteNode(int locate) {
		Node p, q;
		int data, i;
		if(locate < 1 && locate > this.lengthOfList) {
			return -1;
		}
		p = this.head;
		if(locate == 1) {
			this.head = p.next;
		} else {
			q = this.head;
			for(i = 1; i < locate-1 && q != null; i++) {
				q = q.next;
			}
			p = q.next;
			q.next = p.next;
		}
		data = p.data;
		this.lengthOfList--;
		return data;
	}
	
	
	//print all data in the list
	public void printList() {
		Node p = this.head;
		for(int i = 0; i < this.lengthOfList; i++) {
			System.out.println(p.data);
			p = p.next;
		}
	}
	
	
}
