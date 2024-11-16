package pack1;

public class ClassB 
{
   void meth1(int i)
   {
	   System.out.println("Hi");
	   System.out.println(i);
	   
   }
   public static void main(String[] args) 
   {
	   System.out.println("Start");
	   ClassB aobj=new ClassB();//creating an object
	   aobj.meth1(30);
	
   }
	
}
