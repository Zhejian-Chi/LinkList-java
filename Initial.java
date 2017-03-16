package com.chi;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList L = new LinkedList();
		L.addNode(5);
		L.addNode(10);
		L.addNode(20);
		//System.out.println("length of List:"+L.lengthOfList);
		//System.out.println(L.head.data);
		//System.out.println(L.currentPosition.data);
		//System.out.println(L.getDataOfGivenIndex(1));
		//System.out.println(L.locateData(3));
		L.insertNode(100, 1);
		L.deleteNode(3);
		L.printList();
	}

}
