package Exception_handling;

public class Demoexception {

	public Demoexception() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
       int num=50/2;
       System.out.println(num);
      
       int num1=50/25;
       System.out.println(num1);
       try
       {
    	   int num2=50/0;
    	   System.out.println(num2);
       }
       catch(Exception a)
       {
    	   System.out.println(a);
       }
       int num3=50/10;
       System.out.println(num3);
	}

}
