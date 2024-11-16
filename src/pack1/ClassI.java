package pack1;

public class ClassI 
{
	public void meth1()
	{
		System.out.println("meth1() called");
	}
	public ClassI()//Non-parameterized constructor
	{
		new ClassI(500).meth1();
		System.out.println("Non-Parameterized method called");
		new ClassI(100);
		
	}
	public ClassI(int i)//parameterized constructor
	{
		System.out.println("Parameterized method called");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		ClassI aobj1=new ClassI();
		aobj1.meth1();
		System.out.println("End");
		
	}

}
