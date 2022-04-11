package Assignments;
import java.util.Scanner;
public class addition {
	 public static void main(String arg[]){
	        int a,b,add;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the 1St Number: ");
	        a = sc.nextInt();
	        System.out.print("Enter the 2nd Number: ");
	        b = sc.nextInt();
	        add = add(a,b);
	        System.out.print("The Addition of the Two Integer is: "+add);
	        
	    }
	    public static int add(int a,int b)
	    {
	        int add = a+b;
	        return add;
	    }
	}
