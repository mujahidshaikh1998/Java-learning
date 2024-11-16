package pack1;

public class ClassP 
{
	String dishchickenname;
	String dishquantity;
	int dishprice;
	
	static String restuarent="Munazza";
	
	ClassP(String chickenname,String quantity,int price)
	{
		dishchickenname=chickenname;
		dishquantity=quantity;
		dishprice=price;
		
	}
	public static void main(String[] args) 
	{
		ClassP dish1=new ClassP("zafrani","300g",180);
		ClassP dish2=new ClassP("Tandoori","250g",120);
		ClassP dish3=new ClassP("Mughlai","100g",150);
		
		
		System.out.println("testing git");
		System.out.println("chicheken details :"+dish1.dishchickenname+" "+dish1.dishquantity+" "+dish1.dishprice+" "+restuarent);
		System.out.println("chicheken details :"+dish2.dishchickenname+" "+dish2.dishquantity+" "+dish2.dishprice+" "+restuarent);
		System.out.println("chicheken details :"+dish3.dishchickenname+" "+dish3.dishquantity+" "+dish3.dishprice+" "+restuarent);
	}

}
