package main;
import main.Node;

public class CustomTree {
	// The root node. All nodes go into this one
	static Node root;
	
	// give the constructor a value for the root node
	CustomTree(int rootData){
		root = new Node(rootData);
	}
	
	// method to add a node recursively into the root
	static void add(int data){
		Node n = new Node(data);
		insert (root, n);
	}
	
	// give it the parent node and the node to be inserted
	private static void insert(Node node, Node value){
		
		// if the insertion node's data is less than the parent node's data, then it goes to the left
		if (value.data < node.data){
			
			// if there is a value in the left spot
			if(node.left != null){
				
				value.depth++; // we +1 the depth (it's going down a level)
				insert(node.left, value); // try and insert it into the left node
				
			}
			
			// there isn't a node in this position, so we set it to the insertion node.
			else{ 
				
				value.depth++; // we +1 the depth (it's going down a level)
				node.left = value; // set the node
				
				System.out.println("Inserted " + value.data + " to the left of " + node.data + " at depth " + node.left.depth);
				
			}
		}
		
		// the insertion node is greater than the parent node
		else if(value.data > node.data){
			
			// if there is a value in the right spot
			if(node.right != null){
				
				value.depth++; // we +1 the depth (it's going down a level)
				insert(node.right, value); // try and insert it into the right node
				
			}
			
			// there isn't a node in this position, so we set it to the insertion node.
			else{
				value.depth++; // we +1 the depth (it's going down a level)
				node.right = value; // set the node
				
				System.out.println("Inserted " + value.data + " to the right of " + node.data + " at depth " + node.right.depth);
				
			}
		}
	}
	
	// return the root node
	Node getRoot(){
		return root;
	}
	
}
