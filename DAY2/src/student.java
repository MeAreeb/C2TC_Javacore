
public class student {
	int noofstudent;
	String Sname;
	
	int std;
	public void setStd(int S)
	{
		this.std=S;
	}
	public int getstd()
	{
		return std;
	}
	
	void display()
	{
		System.out.println("WELCOME STUDENTS");
	}
	
	public static void main(String[] args)
	{
student obj=new student();

  obj.display();
  obj.setStd(4);
  System.out.println(obj.getstd());

	}

}
