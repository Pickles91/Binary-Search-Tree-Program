/*
 Information:
  Name: Steven Sommer
  Date: 4/22/2022
  Course: Data Structures
  Assignment: Binary Search Tree Program
 */

import java.util.*;
public class Queue {

	//Use an ArrayList as underlying data structure
	private ArrayList<Object> queue;
	
	/* Default constructor
	 * Pre: Nothing
	 * Post: Object initialized. ArrayList set to go.
	*/
	public Queue() {
		queue = new ArrayList<Object>();
	}
	
	/* Push function: Adds object to queue
	 *  Pre: takes in item obj of Object type
	 *  Post: queue now contains obj at the end
	*/
	public void push(Object obj) {
		queue.add(obj);
	}
	
	/* Pop function: Pulls item off the beginning of the queue and returns it.
	 * Pre: Queue is initialized.
	 * Post: First item removed and returned. If there isn't one, null is returned.
	*/
	public Object pop() {
		Object obj = null;
		
		// Double-check that there's actually stuff in queue first
		if(queue.size() > 0) {
			obj = queue.get(0);  // Start from beginning
			queue.remove(0);  // Don't forget to remove the item!
		}
		
		return obj;
	}
	
	/* Size function
	 *  Pre: Queue exists and is initialized
	 *   Post: Size of queue is returned
	*/
	public int size() {
		return queue.size();
	}
	
	/* ToString function
	 *  Pre: Queue is initialized
	 *  Post: string representation of queue is returned.
	 *   This can be printed or further processed.
	*/
	public String toString() {
		String queueString = "";
		for(Object a: queue) {
			queueString += a + " ";
		}
		
		return queueString;
	}
}
