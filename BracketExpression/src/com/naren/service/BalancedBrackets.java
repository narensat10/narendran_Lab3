package com.naren.service;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {
	/*Function to check if brackets are balanced*/
	public boolean areBracketsBalanced(String expr)
	{
		Deque<Character> stack= new ArrayDeque<Character>();
		for(int i=0;i<expr.length();i++)
		{
			char exp=expr.charAt(i);
			if (exp=='{'||exp=='('||exp=='[')
			{
				/* Push the element in the stack if the element is a open parentheses*/
				stack.push(exp);
				continue;
			}
			/* after check for open parentheses if stack is empty return false as the stack is not balanced*/
			if (stack.isEmpty())
				return false;
			char temp;
			switch (exp) {
			case '}':
				temp=stack.pop();
				if (temp=='('||temp=='[')
					return false;
				break;
			case ')':
				temp=stack.pop();
				if (temp=='{'||temp=='[')
					return false;
				break;
			case ']':
				temp=stack.pop();
				if (temp=='('||temp=='{')
					return false;
				break;
			}
		}
		/*If the stack is empty the expression is balanced*/
		return (stack.isEmpty());
	}
}
