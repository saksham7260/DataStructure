package com.java.TrainingSession.LinkedList;

public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList List = new SinglyLinkedList();
		List.InsertAtEnd(20);
		List.InsertAtEnd(30);
		List.InsertAtEnd(130);
		List.InsertAtEnd(200);
		List.InsertAtEnd(300);
		List.InsertAtBeginning(10);
		List.DeleteByValue(100);
		List.DisplayList();
		System.out.println(List.Search(1000));

	}

}
