package pack1;

public class Myfirstprogram 
{
	int meth1(int i)
	{
		System.out.println("Hi");
		System.out.println(i);
		new Myfirstprogram().meth3(10,20);
		return 10;
	}
	 
	String meth2(String S,char c)
	{
		System.out.println("Hello");
		System.out.println("s");
		System.out.println(S);
		Myfirstprogram aobj=new Myfirstprogram();
		aobj.meth3(5,2);
		return"hi";
		
	}
	int meth3(int a, int b)
	{
		System.out.println("Hello World");
		System.out.println("A value is :"+a);
		return 10;
	}
	public static void main(String[] args) 
	{
		new Myfirstprogram().meth2("java is awesome", 'M');
		
		
	}

}
