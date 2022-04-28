/*
 Information:
  Name: Steven Sommer
  Date: 4/22/2022
  Course: ata Structures
  Assignment: Binary Search Tree Program
 */

public class TestTree {

	public static void main(String[] args) {
		
		Tree myTree = new Tree();
		myTree.createTreeFromFile("src\\tree1.txt");
		System.out.println();
		
		myTree.printTree();
		System.out.println();
		
		if(myTree.findItem("zulu")!=null) {
			System.out.println("Item found!");
		}
		else {
			System.out.println("Not found.");
		}
		
		System.out.println();
		
		if(myTree.findItem("bat")!=null) {
			System.out.println("Item found!");
		}
		else {
			System.out.println("Not found.");
		}
		System.out.println();
		
		if(myTree.findItem("catfish")!=null) {
			System.out.println("Item found!");
		}
		else {
			System.out.println("Not found.");
		}
		System.out.println();
		
		System.out.println("*************");
		System.out.println();

		
		myTree.createTreeFromFile("src\\tree2.txt");
		System.out.println();

		myTree.printTree();
		System.out.println();
		
		if(myTree.findItem("45")!=null) {
			System.out.println("Item found!");
		}
		else {
			System.out.println("Not found.");
		}
		System.out.println();
		
		if(myTree.findItem("60")!=null) {
			System.out.println("Item found!");
		}
		else {
			System.out.println("Not found.");
		}
	}
}
