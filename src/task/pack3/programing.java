package task.pack3;

public class programing 
{
	public programing() //non-parameterized constructor
	{
		System.out.println("i love the programing language");
		
	}
	public programing(String s)//parameterized constructor
	{
		System.out.println("I love "+s);
	}
	public static void main(String[] args)
	{
		String s = "java";
		programing aobj1=new programing();
		programing aobj2=new programing(s); 
	}

}
