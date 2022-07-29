import java.util.Scanner;

import com.naren.service.BalancedBrackets;

public class Driver {
	 
	    public static void main(String[] args)
	    {
	    	/*Creating String variable expr to store the expression given by the user*/
	    	String expr;
	        Scanner sc=new Scanner(System.in);
	        /*Getting the expression from user*/
	        System.out.println("Enter the Expression");
	        expr=sc.next();
	        /*Creating a object balancedbracket of class BalancedBrackets*/
	        BalancedBrackets balancedbracket=new BalancedBrackets();
	        /* Calling areBracketsBalanced function to check if the expression is balanced or not*/
 	        if (balancedbracket.areBracketsBalanced(expr))
	            System.out.println("Balanced ");
	        else
	            System.out.println("Not Balanced ");
 	        sc.close();
	    }
	}

