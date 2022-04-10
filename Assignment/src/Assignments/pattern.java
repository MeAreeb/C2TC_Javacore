package Assignments;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		int a,b,c;

        System.out.print("Input number of n : ");
     	Scanner in = new Scanner(System.in);
	    c = in.nextInt();

        for(a=1;a<=c;a++)
        {
        for(b=1;b<=a;b++)
         System.out.print(a);
       System.out.println("");
        }
	}

}
