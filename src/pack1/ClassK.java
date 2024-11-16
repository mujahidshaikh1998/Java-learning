package pack1;

public class ClassK //constructor
{
	int calculate(int x)
	{
		System.out.println("Inside calculate:"+x);
		return x*3;
	}
	int compute(int a,int b)
	{
		System.out.println("Inside compute :"+a+","+b);
		return a+b;
	}
	int process(int m,int n)
	{
		System.out.println("Inside process :"+m+","+n);
		return m-n;
	}
	int analyze(int p,int q,int r)
	{
		System.out.println("Inside analyze :"+p+","+q+","+r);
		return p*q+r;
	}
	int evaluate(int x)
	{
		System.out.println("Inside evaluate :"+x);
		return x/2;
	}
	ClassK()//Non-parsmeterized or defualt constructor
	{
		System.out.println(10);
	}
	ClassK(int a,String s)
	{
		System.out.println(a);
		System.out.println(s);
	}
	ClassK(String s,int x)
	{
		System.out.println(s);
		System.out.println((x+2)+100);
	}
	public static void main(String[] args) 
	{
		int result=new ClassK().calculate(new ClassK(new ClassK().evaluate(6),"Hi").compute(10,new ClassK().process(8,4))
				+new ClassK("Hi",20).analyze(5,3,new ClassK().evaluate(6)));
				System.out.println("Final Result :"+result);
		
	}
	

}
