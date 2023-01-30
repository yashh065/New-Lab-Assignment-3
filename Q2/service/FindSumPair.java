package com.greatlearning.Q2.service;

import java.util.HashSet;

public class FindSumPair {
	public Node insert(Node root, int key) {
		if(root==null) {
			return new Node(key);
		}
		if(key<root.data) {
			root.leftNode=insert(root.leftNode,key);
		}
		else {
			root.rightNode=insert(root.rightNode,key);
		}
		return root;
	}
	
	public boolean findPairUtil(Node root,int sum,HashSet<Integer>set) {
		if(root==null)
			return false;

		if(findPairUtil(root.leftNode,sum,set))
			return true;

		if(set.contains(sum-root.data)) {
			System.out.println("pair is found"+" "+(sum-root.data)+","+root.data);
			return true;
		}
		else 
			set.add(root.data);
		return findPairUtil(root.rightNode,sum,set);
	}
	
	public void findPairWithGivenSum(Node root, int sum) {
		HashSet<Integer> set=new HashSet<Integer>();
		if(!findPairUtil(root,sum,set))
			System.out.print("Pair does not exist");
	}
}