package com.naren.main;

public class Driver {
	public static void main(String[] args)
	{
		Node root=null;
		
		FindSum find=new FindSum();
		root=find.insert(root,40);
		root=find.insert(root,20);
		root=find.insert(root,60);
		root=find.insert(root,10);
		root=find.insert(root,30);
		root=find.insert(root,50);
		root=find.insert(root,70);
		
		int sum=80;
		find.FindPair(root,sum);
	}
}
