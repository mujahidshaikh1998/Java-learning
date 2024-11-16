package pack1;

public class ClassJ 
{
	public ClassJ()//non -parameterized constructor.
	{
		System.out.println("Sunday");
		ClassJ aobj=new ClassJ(10);
		System.out.println("Tuesday");
		String s=aobj.display("Challenge Accepted");
		System.out.println(s);
	}
	public ClassJ(int temp)//parameterized constructor
	{
		System.out.println("Saturday");
		ClassJ aobj=new ClassJ(10,20);
		int a=aobj.meth1()+temp;
		System.out.println("===>"+(a+aobj.meth2()));
		System.out.println("Monday");
	}
	String display(String s)
	{
		System.out.println("In the nexr statement i am returning String value");
		return s;
	}
	int meth1()
	{
		return 100;
	}
	int meth2()
	{
		return 99;
	}
	public ClassJ(int data,int temp)
	{
		System.out.println("Thursday");
		System.out.println("===>"+(data+new ClassJ("hi").meth2()-temp));
	}
	ClassJ(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		ClassJ obj=new ClassJ();
		System.out.println("Output Verified");
		
	}

}
