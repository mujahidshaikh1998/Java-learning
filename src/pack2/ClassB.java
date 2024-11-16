package pack2;

public class ClassB 
{
	void meth1(String s,int i,char c)
	{
		System.out.println("s");
		System.out.println(s);
		System.out.println('s');
		System.out.println("i");
		System.out.println(i);
		System.out.println('c');
		System.out.println(c);
		System.out.println("i+90");
		System.out.println("i value"+i);
		
		}
	public static void main(String[] args) 
	{
		new ClassB().meth1("Java is awesome",100, 'M');
		
	}

}
