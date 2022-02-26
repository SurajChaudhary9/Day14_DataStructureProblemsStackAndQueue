/**
 * @author Suraj Chaudhary
 * @date 26-Feb-2022
 */
package com.bridgelabz.ds;

public class Stack {
	LinkedList linkedList = new LinkedList();

	public void push(Object data) {
		linkedList.addFirst(data);
	}

	public void pop() {
		while (linkedList.head != null)
			linkedList.deleteFirst();
	}

	public void displayStack() {
		linkedList.display();
	}
}
