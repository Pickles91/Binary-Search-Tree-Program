/*
 Information:
  Name: Steven Sommer
  Date: 4/22/2022
  Course: Data Structures
  Assignment: Binary Search Tree Program
 */

import java.io.*;
import java.util.*;


public class Tree {
	
	// Need private member variable to keep track of tree's root
	private Node root;
	
	// Default constructor
	public Tree() {
		root = null;
	}
	
	// Non-default constructor
	public Tree(Node root) {
		this.root = root;
	}
	
	public void createTreeFromFile(String filename) {
		// Read tree info from file -- use readTree() function
		readTree(filename);
		
		// Store in an ArrayList.
		ArrayList<String> al = new ArrayList<String>();
		
		// Collections sort function to sort everything in ascending order.
		Collections.sort(al);
		
		// TODO: Call your function to recursively build tree,
		//			starting with this.root.
		if(this.root == null) return;
		printTree();
	}
	
	/* TODO: Recursively call this on subsets of the original values.
		 * 		 
		 *  Note that you can use the List.sublist() function to create a sublist of the ArrayList passed in. 
		 *  Feel free to check the List API on how to do this.
		*/
		public Node createBranch(List<String> values) {
		// TODO: Get size for the array of values coming in, store in variable
			values.size();
			     
			
		// TODO: Calculate midpoint and store. Round down using integer division
			//int n = namesize();
			//new midpoint = namesize();
	
			
	   // TODO: Test three cases for creating a new node:
			// 1. A leaf node
			Node newNode = newNode(left, right);
			
			// 2. Node has only one child
			Node left = createBranch(left.sublist);
			
			// 3. Node has two children
			Node right = createBranch(right.sublist);
		}

	
	public Node findItem(String str) {
		// Print out item searching for
		System.out.println("Item to find: " + str);
		
		// Print out beginning of node list
		System.out.print("Nodes explored: ");
		
		// Calling recursive findItem function to search for item passed in to this fcn.
		Node found = findItem(this.root,str);
		
		// Print one last newline
		System.out.println();
		
		// Return the node where item was found.
		return(found);
	}
	
	
	public Node findItem(Node tempRoot,String str) {
		//Print out the item you're currently exploring
		System.out.println(str);
		
		Node tempNode = null;
		
		// Do a String comparison
		int compareResult = tempRoot.item.compareTo(str);
		
		// Result of comparison. 
		if (compareResult == 0) {
			return tempRoot;
		}
		if (compareResult < -1) {
			return findItem(tempRoot.left, str);
		 }
		if (compareResult > 1) {
			return findItem(tempRoot.right, str);
		 }
		else {
			return tempNode;
		}
	}
	
	
	
	// TODO: Write a function that prints the nodes in the tree by level.
	//		 You'll need to use the Queue class that I've written for you. 
	public void printTree() {
		Queue nodeQueue = new Queue(); // Queue to keep track of the nodes explored.
		Queue itemQueue = new Queue(); // Another queue to keep track of the data item 
									   //    for each node as it's popped.
		// Start with the root, as long as it's not null
		if(this.root!=null) {
			nodeQueue.push(this.root);
		}
		
		// TODO: Finish this while loop
		// While there are items still in the queue
		while(nodeQueue.size()>0) {
			// Pop item & store the node
			// Note the type casting.
			Node popped = (Node) nodeQueue.pop();
			
			// Push data item onto itemQueue
			itemQueue.push(popped);
			
			// Push child nodes (if any) onto nodeQueue
			nodeQueue.push(popped);

		}
			
		// TODO: Calculate the deepest level you'll need 
		//			to go down into. Hint: look at the size of the queue.
		//		 Be sure to store this as an integer called "maxLevel".
		for (int i = 0; i < 2; i++) {
			//pop and print
		}
		
		System.out.println("Max level: " + maxLevel);

		// TODO: Go through queue and print the tree!
		//		 You'll need to know the maxLevel, calculated above.
		//		 Each level should contain 2^(level-1) nodes, at most.
		//		 Don't forget to print a new line between levels!

	}
	
	
	/* Pre and Post Conditions
	 * 
	 * Pre: Takes in filename where tree is stored and tokenizes based on space character
	 * Post: Returns an ArrayList holding each item to go in the tree nodes. 
	 * 
	 * For further details, see: https://www.tutorialspoint.com/java/java_filereader_class.htm
	*/
	public ArrayList<String> readTree(String filename) {
		
		FileReader fr = null; // To read in file
		ArrayList<String> al = new ArrayList<String>();
		
		try {
			fr = new FileReader(filename); 
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
			return al;
		}
		
		char [] a = new char[50];
		
		try {
			fr.read(a);   // reads the content to the array
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	     
		try{
			fr.close();
		}
		
		catch(IOException e) {
			System.out.println(e);
		}
		
		String as = new String(a);
		as = as.replaceAll("[\\n\\t]", ""); //Strip out all tabs and newlines
		System.out.println(as.strip());
		StringTokenizer tok = new StringTokenizer(as.strip()); //Strip out trailing spaces
		
		while (tok.hasMoreTokens()){
			System.out.print(tok.nextToken() + ",");
			al.add(tok.nextToken());
		}
		return al;
	}

	
	/* printArray() function
	 * This function is mostly here as a convenience. 
	 * I added it so you can use it to print out a list of 
	 * items to double-check that your sublists are correct.
	*/
	public void printArray(List<String> al) {
		for(String a : al) {
			System.out.print("" + a + " ");
		}
		System.out.println();
	}
	
}
