
package task.pack3;

public class ClassA 
{
	     String s ;
	
		public ClassA(String s) {
			super();
			this.s = s;
		}
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
		ClassA()//Non-parsmeterized or defualt constructor
		{
			System.out.println(10);
		}
		ClassA(int a,String s)
		{
			System.out.println(a);
			System.out.println(s);
		}
		ClassA(String s,int x)
		{
			System.out.println(s);
			System.out.println((x*2)+100);
		}
		public static void main(String[] args) 
		{
			int result=new ClassA().calculate(new ClassA(new ClassA().evaluate(6),"Hi").compute(10,new ClassA().process(8,4))
					+new ClassA("Hi",20).analyze(5,3,new ClassA().evaluate(6)));
					System.out.println("Final Result :"+result);
			
		}
		

	

}
