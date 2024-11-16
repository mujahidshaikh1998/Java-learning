package pack1;

public class ClassD 
{
	void meth1()
	{
		System.out.println("meth1() called");
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		return;
	}
	int meth2()
	{
		System.out.println("meth2() called");
		return 10;
	//	System.out.println("Hello World");//C.E because it is unreachable code
	}
	int meth3(int x)
	{
		System.out.println("meth4() called");
		System.out.println("x value is :"+x);
		System.out.println("int & char both are campatble with each other");
		return 'a';
	}
	ClassA meth4()
	{
		System.out.println("meth4() called");
		return new ClassA();
	}
	int meth5(int i)
	{
		
		
		System.out.println("meth5() called");
		if(i<=100)
		{
			System.out.println("if block executed");
			return 100;
			//System.out.println("Hi");//C.E because it is enreachable code
		}
		else
		{
			System.out.println("else block executed");
			return 1000;
			//System.out.println("Hello");
		}
	}
	public static void main(String []args) 
    {
    	System.out.println("Start");
    	ClassD aobj=new ClassD();
    	//aobj.meth1();
    	//System.out.println("meth2() is returning:"+aobj.meth2());
    	//System.out.println("meth3() is returning:"+aobj.meth3(0));
    	//System.out.println("meth4() is returning:"+aobj.meth4());
    	System.out.println("meth5() is returning:"+aobj.meth5(0));
    	System.out.println("End");
    	
    }
}
