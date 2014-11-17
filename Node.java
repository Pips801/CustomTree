package main;

public class Node {

	// left and right node values
	Node left;
	Node right;
	
	//node data
	int data;
	
	// node depth
	int depth;
	
	Node(int data){
		this.data = data;
		depth = 0;
	}

	
}