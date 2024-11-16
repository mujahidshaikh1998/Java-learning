package pack2;

public class ClassX 
{
	int meth1(int a,int b)//meth2() a=200,b=199
	{
		System.out.println(a);
		System.out.println(a-b);
		return new ClassX().meth4(a-1,"Hi");
	}
	String meth2(int x)//main() x=500
	{
		System.out.println(x-new ClassX().meth1(200,199));
		System.out.println(x);//500-398=102
		return "Java";
	}
	String meth3(int a,int b,String s)//main() a=15,b=25
	{                                          //s="Java"
		System.out.println(a);
		System.out.println(a+a);
		System.out.println(a+b);
		return s;
		
	}
	int meth4(int a,String s)//meth1() a=199,s="Hi"
	{
		System.out.println(a);
		System.out.println(s);
		return a+a;
		
	}
	String meth5(String s)
	{
		return s;
	}
	public static void main(String[] args) 
	{
		System.out.println(new ClassX().meth5(new ClassX().meth3(15,25,new ClassX().meth2(500))));
		//meth5() return "java"
	}
	

}
