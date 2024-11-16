package pack1;

public class ClassF 
{
	int i;
	//int i=5;
	byte b;
	short s;
	long l;
	
	float f;
	double d;
	
	char c;
	boolean flag;
	
	void meth1()
	{
		System.out.println("Printing the default values of the detatype\n");
		System.out.println("int valaue i:"+i);
		System.out.println("\nbyte value b:"+b);//(\n=is use for printing our output in next line)
		System.out.println("short value s:"+s);
		System.out.println("long value l:"+l);
		
		System.out.println("float value f:"+f);
		System.out.println("double value d:"+d);
		
		System.out.println("char value c:"+c);//  /u0000=>NPC(Not Printable Characters)
		System.out.println("boolean value flag:"+ flag);//false
		
	}
	void meth2() 
	{
		System.out.println("meth2() called");
		int i1=100;
		int i2=50;
		int i3=i1+i2;
		System.out.println("i3:"+i3);
		
		float f=10.9f;
		System.out.println("\nfloat:"+f);//(\n=is use for printing our output in next line)
		long x=2147483648L;
		System.out.println("\nlong :"+x);
		
		
		
	}
	public static void main(String[] args) 
	{
		ClassF aobj=new ClassF();//Creating an object
		//aobj.meth1();
		aobj.meth2();
		
	}

}
