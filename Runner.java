package main;

import main.CustomTree;

import java.io.IOException;
import java.util.Scanner;

public class Runner {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {4, 6, 1, 35, 9, 64, 3, 68, 5, 99, 0, 10};
		
		
		
		CustomTree newtree = new CustomTree(4);
		for(int i = 0; i < numbers.length; i++){
			newtree.add(numbers[i]);
		}
		
		System.out.println(newtree.getRoot().right.right.left.right.depth);
		
	
		
		
	}
	
}
