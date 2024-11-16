package pack2;

public class ClassE 
{
	void meth1()
	{
		int a=12;
		System.out.println("a value is:"+a);
		System.out.println(a*3);
		System.out.println(a/2);
		ClassE aobj=new ClassE();
		aobj.meth2();
		System.out.println("--------");
	}
	void meth2()
	{
		System.out.println("Coding is art of Brain");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		System.out.println("--------");
		new ClassE().meth1();
		System.out.println("End");
		
	}

}
