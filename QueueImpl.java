package com.framework.Queue;

public class QueueImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray queue = new QueueArray(4);
		queue.Enqueue(12);
		queue.Enqueue(13);
		queue.Enqueue(14);
		queue.Enqueue(15);
		queue.Display();
		queue.Remove();
		queue.Remove();
		queue.Remove();
		queue.Remove();
		queue.Remove();
	}

}