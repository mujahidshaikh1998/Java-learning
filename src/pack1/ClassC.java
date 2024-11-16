package pack1;

public class ClassC 
{
	public void meth1()
	{
		new ClassC().meth2();
		System.out.println("meth()1 called");
		
	}
	void meth2()
	{
		System.out.println("Hi");
		new ClassC().meth3();
		
	}
	void meth3()
	{
	    System.out.println("Hello");	
	}
	
	

}
