package com.java.TrainingSession.LinkedList;

//Create A Singly Linked List Operations
public class SinglyLinkedList {
	
	private Node Head; //This Is The Head Node Pointer Which Will Points To The First Node.
	
	//Function To Insert New Node At The beginning Of Linked List
	public void InsertAtBeginning(int Data) {
		Node NewNode = new Node(Data);      //Allocate Memory For New Node
		NewNode.next = Head;                //Assign The Address Of Head In The of New Node
		Head = NewNode;                     //Point The Head Node Pointer To New Node
	}
	
	//Function To Insert New Node At The End Of The Linked List
	public void InsertAtEnd(int Data) {
		Node NewNode = new Node(Data);  //Allocate Memory For New Node
		if(Head == null) {       //Check Whether The Linked List Is Empty Or not
			Head = NewNode;      //If Empty, Point head Node Pointer to New Node
			return;              //Exit The Function
		}
		//If the Linked List is not Empty
		Node DummyNode = Head;   //Take A Dummy Node Pointer For Iteration
		while(DummyNode.next != null) {  //Iterate Until it reach to the end of Linked List
			DummyNode = DummyNode.next;  //Iteration Statement
		}
		//Once DummyNode reached to end
		DummyNode.next = NewNode;     //Assign the Address of New Node to the next of Last Node
	}
	
	public void DisplayList() {
		if(Head == null) {        //Check whether Head is null or not
			System.out.println("Linked List Empty.");  //If Null,The Linked List Is Empty
			return;                              //Exit Function.
		}
		//If Linked List Is Not Empty
		Node DummyNode = Head;          //take a DummyNode Pointer For Iteration
		while(DummyNode != null) {      //Iterate until you found no data
			System.out.print(DummyNode.data +"--> ");  //
			DummyNode = DummyNode.next;
		}
		System.out.println("Null");
	}
	
	//Function To Search Any Value In Linked List
	public boolean Search(int Data) {
		Node DummyNode = Head;          //take a DummyNode Pointer For Iteration
		while(DummyNode != null) {      //Iterate untill you found no data
			if(DummyNode.data == Data) {  //
				return true;          //If Found,Return True
			}
			DummyNode = DummyNode.next;    //Then Go For The Next Node
		}
		return false;       //If Not Found, Return False
	
	
	
	}
	
	//Function To Insert Node At Any Position
	public void InsertAtPosition(int Data, int Position) {
		if(Head == null) {
			System.out.println("Linked List Empty");
			return;
		}
		if(Position < 1) {
			System.out.println("Position Must Be Greater Than Equals 1");
			return;
		}
		Node NewNode = new Node(Data);
		Node DummyNode = Head;
		if(Position == 1) {
			NewNode.next = Head;
			Head = NewNode;
			return;
		}
		for(int i = 1; i<Position - 1 && DummyNode != null; ++i) {
			DummyNode = DummyNode.next;
		}
		if(DummyNode == null) {
			System.out.println("Position Out Of Range.");
			return;
		}
		NewNode.next = DummyNode.next;
		DummyNode.next = NewNode;
	}
	
	//Function to Delete Node By Position
	public void DeleteAtPosition(int Position)
	{
		if(Head == null) {
			System.out.println("Linked List Empty.");
			return;
		}
		if(Position < 1) {
			System.out.println("Position Must Be Greater Than Equal 1");
			return;
		}
		if(Position == 1) {
			Head = Head.next;
			return;
		}
		Node DummyNode = Head;
		for(int i = 1 ; i< Position - 1 && DummyNode != null; ++i)
		{
			DummyNode = DummyNode.next;
		}
		if(DummyNode == null || DummyNode.next == null) {
			System.out.println("Position Out Of Range.");
			return;
		}
		DummyNode.next = DummyNode.next.next;
	}
	
	
	//Function To Delete Node By value
	public void DeleteByValue(int Data) {
		if(Head == null) {
			System.out.println("Linked List Empty.");
			return;
		}
		if(Head.data == Data) {
			Head = Head.next;
			return;
		}
		Node DummyNode = Head;
		while(DummyNode.next != null && DummyNode.next.data!= Data) {
			DummyNode = DummyNode.next;
		}
		if(DummyNode == null || DummyNode.next == null) {
			System.out.println("Value Not Found.");
			return;
		}
		DummyNode.next = DummyNode.next.next;
	}
	
	
	
}
	
	