/**UC4 : PROBLEM STATEMENT
 *Ability to create a Deque
 * 
 */

/**
 * @author Suraj Chaudhary
 * @date 26-Feb-2022
 */
package com.bridgelabz.ds;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue");
		Queue queue = new Queue();
		queue.enque(56);
		queue.enque(30);
		queue.enque(70);
		queue.deque();
		queue.deque();
		queue.deque();
	}
}
