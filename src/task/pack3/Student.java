package task.pack3;

public class Student 
{
	public Student()
	{
		System.out.println("Unknown");
	}
	public Student(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		Student aobj1=new Student();
		Student aobj2=new Student("Mujahid");
	}

}

/*class Student{
Student(){
System.out.println("Unknown");
}
Student(String s){
System.out.println(s);
}
public static void main(String[] args) {
Student s1= new Student();
Student s2= new Student("Mujahid");
}
}*/