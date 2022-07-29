package com.naren.main;

public class Driver {
	public static void main(String[] args)
	{
		Node root=null;
		/* Creating find object of class FindSum*/	
		FindSum find=new FindSum();
		/*Getting the elements for BST and inserting them in a Tree*/
		root=find.insert(root,40);
		root=find.insert(root,20);
		root=find.insert(root,60);
		root=find.insert(root,10);
		root=find.insert(root,30);
		root=find.insert(root,50);
		root=find.insert(root,70);
		/*Giving a Sum to find the pair*/
		int sum=80;
		/*Calling method FindPair to find the pair*/
		find.FindPair(root,sum);
	}
}
