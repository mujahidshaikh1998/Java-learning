package pack1;

public class ClassG 
{
	int x=10;//instance or Global or non-static variable
	static int y=20;//static or class variable
	
	boolean flag;
	static float f;
	
	//static int x;
    //String y;
	//static double f;
	//char flag;
	
	void meth1()
	{
		int z=30;//local variable
		System.out.println("meth1() called");
		
		System.out.println("\ninstance variable:"+x);//by using identifier name
		System.out.println("instance variable:"+new ClassG().x);//by using its respective Class object
		
		System.out.println("static variable:"+y);//by using identifier name
		System.out.println("static variable:"+new ClassG().y);//by using its respective Class object
		System.out.println("static variable:"+ClassG.y+"\n");////by using its respective Class name
		
		System.out.println("Local variable:"+z);//by using identifier name
		
	}
	void meth2()
	{
		System.out.println("\nmeth2() called");
		int x=111;
		int y=222;
		
		System.out.println("\ninstance variable:"+new ClassG().x);
		System.out.println("static variable:"+ClassG.y);
		//System.out.println("local variable:"+z);//C.E
		System.out.println("local variable x:"+x+"& y:"+y);
		
	}
	void meth3()
	{
		System.out.println("meth3() called");
		int num;
		System.out.println("instance variable flag:"+flag);
		System.out.println("static variable f:"+f);
		//System.out.println("local variable num:"+num);//C.E
		
	}
	
	public static void main(String[] args) 
	{
		ClassG aobj=new ClassG();
		aobj.meth1();
		aobj.meth2();
		aobj.meth3();
		
	}
}
