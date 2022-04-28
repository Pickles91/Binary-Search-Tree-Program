/*
 Information:
  Name: Steven Sommer
  Date: 4/22/2022
  Course: Data Structures
  Assignment: Binary Search Tree Program
 */


// Make this package-private
class Node {
	// Three member variables to keep track of everything for the current node.
	String item;
	Node left;
	Node right;

	
	// Constructor that will initialize based on String newItem
	Node(String newItem){
		item = newItem;
		left = right = null;
	}
	
	// Constructor that will initialize based on two arguments.
	Node (String newItem, Node left, Node right) {
		item = newItem;
		this.left = left;
		this.right = right;
	}
	
	
	/* toString() method 
	 * Pre: Node is initialized
	 * Post: Will return String object for Node's item.
	 * 
	 */
	public String toString() {
		return item.toString();
	}
}
