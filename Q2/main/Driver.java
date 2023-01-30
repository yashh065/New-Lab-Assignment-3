package com.greatlearning.Q2.main;

import java.util.Scanner;

import com.greatlearning.Q2.service.FindSumPair;
import com.greatlearning.Q2.service.Node;

public class Driver {
	public static void main(String[] args) {

		Node root =null;
		
		// create an object to invoke insert method
		FindSumPair findsp=new FindSumPair();
		root=findsp.insert(root,40);
		root=findsp.insert(root,20);
		root=findsp.insert(root,60);
		root=findsp.insert(root,10);
		root=findsp.insert(root,30);
		root=findsp.insert(root,50);
		root=findsp.insert(root,70);
		
		//import Scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sum that you want to check");
		int sum=sc.nextInt();
		
		findsp.findPairWithGivenSum(root,sum);
		
		sc.close();
	}

}
