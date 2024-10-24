package com.jsp.NumberProgram;
import java.util.Scanner;

public class SpecialNumber 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scn.nextInt();
		    int res = 0;
		int n1 = n*3;
		int n2 = n1+3;
		int n3 = n2*3;
	    System.out.println(n3);
	    
	    while(n3>0)
	    	{
	    		int d = n3%10;
	    		res+=d;
	    		n3/=10;
	    	}
	    System.out.println("Result is "+res);
	    
	    if(res==9)
	    {
	    	System.out.println("Special Number");
	    }
	    else
	    {
	    	System.out.println("Not a Special Number");
	    }
	}

}
