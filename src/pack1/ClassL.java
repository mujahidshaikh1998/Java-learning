package pack1;

public class ClassL //instance variable and static last point explain in this program
{
	String empname;
	int empsal;
	String empdept;
	
	static String empcompany="TCS";//static variable
	
	ClassL(String name,int sal,String dept)//parameterized constructor
	{
		empname=name;
		empsal=sal;
		empdept=dept;
	}
	public static void main(String[] args) 
	{
		ClassL emp1=new ClassL("John",10000,"Java");
		ClassL emp2=new ClassL("Winston",40000,"AWS");
		ClassL emp3=new ClassL("Athena",60000,"Sring");
		
		System.out.println("emp1 Details :"+emp1.empname+" "+emp1.empsal+" "+emp1.empdept+" "+emp1.empcompany);
		System.out.println("emp2 Details :"+emp2.empname+" "+emp2.empsal+" "+emp2.empdept+" "+emp2.empcompany);
		System.out.println("emp3 Details :"+emp3.empname+" "+emp3.empsal+" "+emp3.empdept+" "+emp3.empcompany);
		System.out.println("\n");
		emp1.empsal=95000;
		emp1.empcompany="HCL";
		
		System.out.println("emp1 Details :"+emp1.empname+" "+emp1.empsal+" "+emp1.empdept+" "+ClassL.empcompany);
		System.out.println("emp2 Details :"+emp2.empname+" "+emp2.empsal+" "+emp2.empdept+" "+ClassL.empcompany);
		System.out.println("emp3 Details :"+emp3.empname+" "+emp3.empsal+" "+emp3.empdept+" "+ClassL.empcompany);
		//by using its respective Class name
	}

}
