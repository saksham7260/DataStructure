package com.framework.Queue;

public class QueueArray {
	int[] queue;
	int front;
	int size;
	int rear;
	int count;
	
	QueueArray(int size){
		this.size = size;
		queue = new int[size];
		front = 0;
		count = 0;
		rear = -1;
	}
	
	void Enqueue(int Value) {
		if(rear == size -1) {
			System.out.println("Queue is full.");
			return;
		}
		queue[++rear] = Value;
		System.out.println(Value +" Enqueued");
		++count;
	}
	void Remove() {
		if(rear ==-1 || count ==0) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println(queue[front]+" Is removed.");
		--count;
		++front;
	
	}
	void Display() {
		if(rear == -1|| count ==0) {
			System.out.println("Queue is Empty.");
			return;
	}
	for(int i=front; i<=rear; ++i) {
		System.out.println(queue[i]+" ");
	}
	System.out.println();

}
	
}