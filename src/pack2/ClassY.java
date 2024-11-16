package pack2;

public class ClassY 
{
	public String testmethod1()//main() 
	{                          
		System.out.println(35);
		return new ClassY().testmethod3(new ClassY().testmethod2())+ new ClassY().testmethod4("Here");
		//meth3() return "is"
		//meth4() return "awesome"
	}
	public int testmethod2()//meth1(),first
	{
		System.out.println(25);
		return 25+5;
	}
	public String testmethod3(int a)//meth1() a=30
	{
		System.out.println(15);
		return "is";
	}
	public String testmethod4(String s)//main()
	{
		System.out.println(45);
		return "awesome";
	}
	public static void main(String[] args) 
	{
		ClassY t=new ClassY();
		System.out.println("java"+t.testmethod1());
		
	}

}
