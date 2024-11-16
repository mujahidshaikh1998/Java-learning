package pack2;

public class ClassG 
{
	/*void meth1()    //this method is not mandatory
	{
		System.out.println("meth1()");
	}*/
	
	public static void main(String[] args) 
	{
		ClassG aobj1=new ClassG();
		ClassG aobj2=new ClassG();
		
		System.out.println("aobj1.hashcode===>"+aobj1.hashCode());
		System.out.println("aobj2.hashcode===>"+aobj2.hashCode());
	//hashcode() provides unique identification number of our class object
		
		System.out.println(aobj1.equals(aobj1));//equals()
		System.out.println(aobj2.equals(aobj1));
		
	}

}
