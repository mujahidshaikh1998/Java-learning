package pack2;

public class ClassA 
{
	void meth1(int i)
	{
		System.out.println("Hi");
		System.out.println("i value:"+i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		new ClassA().meth1(100);
		
	}

}
