package pack1;

public class ClassH 
{
	int x=25;//instance variable 
	static int y=35;//static variable
	
	static float f;
	boolean flag;
	char c;
	
	void meth1()
	{
		int z=45;//local variable
		System.out.println("meth1() called ");
		
		System.out.println("instance variable:"+x);//instance variable by using identifire name
		System.out.println("instance variable:"+new ClassH().x);
		
		System.out.println("\nstatic variable:"+y);//static variable by using identifire name
		System.out.println("static variable:"+new ClassH().y);
		System.out.println("static variable:"+ClassH.y);
		System.out.println("\nLocal variable:"+z);
	}
	void meth2()
	{
		int x=333;
		int y=444;
		 
		System.out.println("meth2() called");
		System.out.println("\ninstance variable:"+x);
		System.out.println("static variable:"+y);
		//System.out.println("local variable:"+z);
		System.out.println("\nLocal variable x:"+x + "& Y"+y);
		
	}
	void meth3()
	{
		System.out.println("meth3() called");
		int num;
		System.out.println("instance variable flag:"+flag);
		System.out.println("static variable f : "+f);
		System.out.println("static variable char:"+c);
	}
	
	public static void main(String[] args) 
	{
		ClassH aobj=new ClassH();
		//aobj.meth1();
		//aobj.meth2();
		aobj.meth3();
		
	}

}
