package Assignments;

import java.util.Scanner;

public class multiplicationofinteger {

	public static void main(String[] args) {
		int a,b;
		
		System.out.println("Input the number(Table to be calculated): ");
		{
			System.out.print("Enter the number : ");
			Scanner in = new Scanner(System.in);
			         b = in.nextInt();
			         
			         System.out.println ("\b");
			         for(a=0;a<=b;a++)
			        	 
			        	 System.out.println(b+" X "+a+" = " +b*a);
			         
		}

	}

}
