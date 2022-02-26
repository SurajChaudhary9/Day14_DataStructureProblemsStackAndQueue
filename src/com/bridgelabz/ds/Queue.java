/**
 * @author Suraj Chaudhary
 * @date 26-Feb-2022
 */
package com.bridgelabz.ds;

public class Queue {
	LinkedList linkedList = new LinkedList();

	public void enque(Object data) {
		linkedList.addLast(data);
		displayQueue();
	}

	public void deque() {
		linkedList.deleteFirst();
		displayQueue();
	}

	public void displayQueue() {
		linkedList.display();
	}
}
