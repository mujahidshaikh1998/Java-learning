package pack2;

public class ClassC
{
	void meth1(int i)
	{
		System.out.println("Hi");
		new ClassC().meth3(2);
		System.out.println(i/2);
	}
	void meth2(char c)
	{
		System.out.println("Hello");
		new ClassC().meth1(4);
		System.out.println(c);
	}
	void meth3(int i)
	{
		System.out.println("Hello World");
		System.out.println(i*i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
     	new ClassC().meth2('M');
     	System.out.println("Start");
	}
	

}
