package multithreading;
class Eclipse extends Thread
{
public void run()
{
	 System.out.println("Eclipse id"+Thread.currentThread().getId());
}
}
class MSEdge extends Thread
{
	public void run()
	{
		System.out.println("MSEdge id"+Thread.currentThread().getId());	
	}
	}
class Outlook extends Thread
{
	public void run()
	{
		System.out.println("Outlook id"+Thread.currentThread().getId());		
	}
}
public class ThreadingExample {

	public ThreadingExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse ob=new Eclipse();
				ob.start();
				
        MSEdge ob1=new MSEdge();
				ob1.start();
				
		Outlook ob2=new Outlook();
				ob2.start();
				

	}

}
