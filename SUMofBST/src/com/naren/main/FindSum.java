package com.naren.main;

import java.util.*;

public class FindSum {
	/*Method to place elements in the balanced tree*/
	public Node insert(Node root,int key)
	{
		/* If the root is null, create a new node and return it*/
		if(root==null)
			return new Node(key);
		/*if the given key is less than the root node, recur for the left tree*/
		if(key<root.node)
			root.left=insert(root.left,key);
		else
		/*if the given key is less than the root node, recur for the right tree*/
			root.right=insert(root.right,key);
		return root;
	}
	/*Method to find the pair to elements which equals the sum*/
	public boolean findpairUtil(Node root, int sum,HashSet<Integer> set)
	{
		if (root==null)
			return false;
		if (findpairUtil(root.left, sum, set))
			return true;
		/*if a pair is formed with the current node, print the pair and return true*/
		if (set.contains(sum-root.node)) 
		{
			System.out.println("Pair is found ("+ (sum-root.node) + ","+ root.node+ ")");
			return true;
		}
		/*Insert the current node's value into the set*/
		else
			set.add(root.node);
		return findpairUtil(root.right, sum, set);
	}

	public void FindPair(Node root, int sum)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		/*If pair not found*/
		if (!findpairUtil(root, sum, set))
			System.out.print("Pairs do not exit"+"\n");
	}
}
