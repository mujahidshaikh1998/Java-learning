package pack1;

public class ClassN 
{
	String Drname;
	int Drsal;
	String Drspecialist;
	
	static String Hospital="Reddy";
	
	ClassN(String name,int sal,String specialist)
	{
		Drname=name;
		Drsal=sal;
		Drspecialist=specialist;
	}
	public static void main(String[] args) 
	{
		ClassN Dr1=new ClassN("Sumit",15000,"Surgical");
		ClassN Dr2=new ClassN("Toufiq",25000,"Daigonostic");
		ClassN Dr3=new ClassN("Anuradha",40000,"Neurologocal");
		
		System.out.println("Dr1 Details :"+Dr1.Drname+" "+Dr1.Drsal+" "+Dr1.Drspecialist+" "+Hospital);
		System.out.println("Dr2 Details :"+Dr2.Drname+" "+Dr2.Drsal+" "+Dr2.Drspecialist+" "+Hospital);
		System.out.println("Dr3 Details :"+Dr3.Drname+" "+Dr3.Drsal+" "+Dr3.Drspecialist+" "+Hospital);
		
		Dr2.Drsal=50000;
		Dr2.Hospital="Jagirdar";
		System.out.println("      ");
		System.out.println("Dr2 Details :"+Dr2.Drname+" "+Dr2.Drsal+" "+Dr2.Drspecialist+" "+ClassN.Hospital);
	}

}
