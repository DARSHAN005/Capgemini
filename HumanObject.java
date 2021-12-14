package Assignments;

public class HumanObject 
{
	//Declaring Variables
	String name;
	String Gender;
	double height;
	//Creating Constructor
	public HumanObject(String name, String gender, double height) {
		super();
		this.name = name;
		Gender = gender;
		this.height = height;
	}
	//Creating Method
	void PersonDetails()
	{
		System.out.println("Person Name: "+name);
		System.out.println("Person Gender: "+Gender);
		System.out.println("Person height: "+height);
	}
	public static void main(String[] args) 
	{
		//Creating Objects for class
		HumanObject obj1=new HumanObject("Naveen","M",6);
		HumanObject obj2=new HumanObject("Gani","M",6);
		HumanObject obj3=new HumanObject("Abhishek","M",6);
		//Invoking or calling methods
		System.out.println("=========================");
		obj1.PersonDetails();
		System.out.println("=========================");
		obj2.PersonDetails();
		System.out.println("=========================");
		obj3.PersonDetails();
		System.out.println("=========================");
	}
	

}
